package com.xiaoshabao.bill.bd.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.xiaoshabao.bill.bd.component.cacheLock.BillSqlBuilder;

public interface DynamicSqlMapper {
	
	/**
	 * 构造新增实体sql
	 * @param mapperName 想要构造的mapper，通过此mapper获得实体类和数据库对应的resultMap
	 * @param tableName 想要更新的表名
	 * @param data 数据，存储值
	 * @return
	 */
	@InsertProvider(type = BillSqlBuilder.class, method = "insertSQL")
	int insertSQL(String mapperName,String tableName,Map<String, Object> data) ;
	/**
	 * 构造更新实体sql
	 * @param mapperName 想要构造的mapper，通过此mapper获得实体类和数据库对应的resultMap
	 * @param tableName 想要更新的表名
	 * @param data 数据，存储值
	 * @param whereColumns 构造where条件的列（填写数据库列名）
	 * @return
	 */
	@UpdateProvider(type = BillSqlBuilder.class, method = "updateSQL")
	int updateSQL(String mapperName,String tableName,Map<String, Object> data,String... whereColumns);
	
	/**
	 * 构造删除实体sql
	 * @param mapperName 想要构造的mapper，通过此mapper获得实体类和数据库对应的resultMap
	 * @param tableName 想要更新的表名
	 * @param data 数据，存储值
	 * @param whereColumns 构造where条件的列（填写数据库列名）
	 * @return
	 */
	@UpdateProvider(type = BillSqlBuilder.class, method = "deleteSQL")
	int deleteSQL(String mapperName,String tableName,Map<String, Object> data,String... whereColumns);

}
