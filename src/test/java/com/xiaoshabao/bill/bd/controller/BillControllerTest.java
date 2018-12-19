package com.xiaoshabao.bill.bd.controller;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;

import com.alibaba.fastjson.JSONObject;
import com.xiaoshabao.bill.bd.dto.BillSaveData;
import com.xiaoshabao.bill.bd.dto.SQLContants;
import com.xiaoshabao.bill.bd.mapper.BillMapper;
import com.xiaoshabao.bill.bd.mapper.DynamicSqlMapper;

import base.test.ControllerTest;

public class BillControllerTest extends ControllerTest{
	//模拟不执行具体方法
	@MockBean
//	@SpyBean
	private DynamicSqlMapper sqlMapper;
	

	@Test
	//@Rollback(false)//事务不回滚
	public void testGetBillList() {
		try {
			//执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
			mvc.perform(
					//请求url
					get("/bill/billList")
					//参数
					.param("token", "1111"))
			//添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）
			.andDo(print())
			//验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）
			.andExpect(status().isOk())
			//最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）
			/*.andReturn()
				.getResponse().getContentAsString()*/;
		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

	@Test
	public void testAddBillList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillView() {
		try {
			String billId="100";
			mvc.perform(get("/bill/billView").param("billId", billId))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.success").value("true"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

	/**
	 * 测试保存逻辑路径
	 */
	@Test
	public void testSaveBillView1() {
		BillSaveData data=getDataSave();
		String json=JSONObject.toJSONString(data);
		
		Mockito.when(sqlMapper.updateSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, data.getBill(), SQLContants.Table.BILL_ID))
        .thenReturn(1);
		
		try {
			mvc.perform(post("/bill/billView").contentType(MediaType.APPLICATION_JSON)
					.content(json).param("billId", data.getBill().get("billId").toString()))
			.andDo(print())
			.andExpect(status().isOk());
			
			Mockito.verify(sqlMapper, Mockito.times(1)).updateSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, data.getBill(), SQLContants.Table.BILL_ID);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	/**
	 * 测试保存逻辑是否能正常保存到数据库
	 */
	@Test
	@Rollback(false)
	public void testSaveBillView2() {
		BillSaveData data=getDataSave();
		String json=JSONObject.toJSONString(data);
		try {
			mvc.perform(post("/bill/billView").contentType(MediaType.APPLICATION_JSON)
					.content(json).param("billId", data.getBill().get("billId").toString()))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.success").value("true"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	private BillSaveData getDataSave() {
		String billId="100";
		BillSaveData data=new BillSaveData();
		data.setBillUpdateType(true);
		Map<String,Object> billData=new HashMap<String, Object>();
		billData.put("billId", billId);
		billData.put("billName", "测试1");
		data.setBill(billData);
		return data;
	}

}
