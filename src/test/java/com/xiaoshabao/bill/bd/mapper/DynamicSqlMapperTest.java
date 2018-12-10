package com.xiaoshabao.bill.bd.mapper;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.xiaoshabao.bill.bd.dto.SQLContants;
@RunWith(SpringRunner.class)
@MybatisTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class DynamicSqlMapperTest {
	
	@Autowired
	private DynamicSqlMapper sqlMapper;

	@Test
	public void testInsertSQL() {
		String billId="101";
		Map<String,Object> billData=new HashMap<String, Object>();
		billData.put("billId", billId);
		billData.put("billName", "测试1");
		int i=sqlMapper.insertSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, billData);
		if(i<1){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testUpdateSQL() {
		String billId="100";
		Map<String,Object> billData=new HashMap<String, Object>();
		billData.put("billId", billId);
		billData.put("billName", "测试1");
		int i=sqlMapper.updateSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, billData, SQLContants.Table.BILL_ID);
		if(i<1){
			fail("Not yet implemented");
		}
	}

}
