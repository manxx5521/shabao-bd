package com.xiaoshabao.bill.bd.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.xiaoshabao.bill.bd.component.cacheLock.BillSqlBuilder;

public interface DynamicSqlMapper {
	
	/**
	 * 构造新增实体sql
	 * @param mapper
	 * @param tableName
	 * @param data
	 * @param whereColumns
	 * @return
	 */
	@InsertProvider(type = BillSqlBuilder.class, method = "insertSQL")
	int insertSQL(String mapperName,String tableName,Map<String, Object> data) ;
	/**
	 * 构造更新实体sql
	 * @param mapper
	 * @param tableName
	 * @param data
	 * @param whereColumns
	 * @return
	 */
	@UpdateProvider(type = BillSqlBuilder.class, method = "updateSQL")
	int updateSQL(String mapperName,String tableName,Map<String, Object> data,String... whereColumns);

}
