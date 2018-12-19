package com.xiaoshabao.bill.bd.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiaoshabao.bill.bd.dto.SQLContants;

import base.test.MapperTest;
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class DynamicSqlMapperTest extends MapperTest{
	
	@Autowired
	private DynamicSqlMapper sqlMapper;

	@Test
	public void test01_testInsertSQL() {
		String billId="101";
		Map<String,Object> billData=new HashMap<String, Object>();
		billData.put("billId", billId);
		billData.put("billName", "测试1");
		billData.put("status", "1");
		int i=sqlMapper.insertSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, billData);
		assertThat(i).isEqualTo(1);
	}

	@Test
	public void test02_testUpdateSQL() {
		String billId="101";
		Map<String,Object> billData=new HashMap<String, Object>();
		billData.put("billId", billId);
		billData.put("billName", "测试2");
		int i=sqlMapper.updateSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, billData, SQLContants.Table.BILL_ID);
		assertThat(i).isEqualTo(1);
	}

}
