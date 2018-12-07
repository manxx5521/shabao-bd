package com.xiaoshabao.bill.bd.component.cacheLock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSession;

import com.xiaoshabao.base.component.SpringContextHolder;
import com.xiaoshabao.bill.bd.dto.SQLContants;

public class BillSqlBuilder {

	/**
	 * 构造新增实体sql
	 * @param mapper
	 * @param tableName
	 * @param data
	 * @param whereColumns
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
		return sql.toString();
	}
	/**
	 * 构造更新实体sql
	 * @param mapper
	 * @param tableName
	 * @param data
	 * @param whereColumns
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
		return sql.toString();
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
