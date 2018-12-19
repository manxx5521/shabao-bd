package com.xiaoshabao.bill.bd.component.cacheLock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xiaoshabao.base.component.SpringContextHolder;
import com.xiaoshabao.bill.bd.dto.SQLContants;

public class BillSqlBuilder {
	
	private final static Logger logger=LoggerFactory.getLogger(BillSqlBuilder.class);

	/**
	 * 构造新增实体sql
	 * @param mapper 想要构造的mapper，通过此mapper获得实体类和数据库对应的resultMap
	 * @param tableName 想要更新的表名
	 * @param data 数据，存储值
	 * @return
	 */
	public String insertSQL(String mapperName,String tableName,@NotNull Map<String, Object> data) {
		
		SQL sql = new SQL() {
			{
				INSERT_INTO(tableName);
			}
		};
		
		getResultMapping(mapperName).forEach(mapping->{
			String property=mapping.getProperty();
			String column=mapping.getColumn();
			if(data.containsKey(property)){
				sql.VALUES(column, new StringBuffer().append("#{param3.").append(property).append("}").toString());
			}
		});
		String insertSql=sql.toString();
		logger.debug(insertSql);
		return insertSql;
	}
	/**
	 * 构造更新实体sql
	 * @param mapper 想要构造的mapper，通过此mapper获得实体类和数据库对应的resultMap
	 * @param tableName 想要更新的表名
	 * @param data 数据，存储值
	 * @param whereColumns 构造where条件的列（填写数据库列名）
	 * @return
	 */
	public String updateSQL(String mapperName,String tableName,@NotNull Map<String, Object> data,String... whereColumns) {
		
		SQL sql = new SQL() {
			{
				UPDATE(tableName);
			}
		};
		
		Map<String,String> wheres=new HashMap<String, String>();
		getResultMapping(mapperName).forEach(mapping->{
			String property=mapping.getProperty();
			String column=mapping.getColumn();
			
			for(String where:whereColumns){
				if(where.equals(column)){
					wheres.put(property, column);
					return;
				}
			}
			
			if(data.containsKey(property)){
				sql.SET(new StringBuffer().append(column).append("=#{param3.").append(property).append("}").toString());
			}
		});
		wheres.forEach((k,v)->{
			sql.WHERE(new StringBuffer().append(v).append("=#{param3.").append(k).append("}").toString());
		});
		String updateSql=sql.toString();
		logger.debug(updateSql);
		return updateSql;
	}
	
	/**
	 * 获得mapper的BaseResultMap配置
	 * @param zz
	 * @return
	 */
	private List<ResultMapping> getResultMapping(String mapperName){
		StringBuilder sb=new StringBuilder();
		sb.append(mapperName);
		sb.append(".");
		sb.append(SQLContants.BASE_RESULT_MAP);
		return SpringContextHolder.getBean(SqlSession.class).getConfiguration().getResultMap(sb.toString()).getResultMappings();
	}
}
