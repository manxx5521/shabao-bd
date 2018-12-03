package com.xiaoshabao.bill.bd.dto;

import java.util.HashMap;
import java.util.Map;

public class BillViewVO {
	
	private Map<String,Object> billInfo=new HashMap<String,Object>();

	public Map<String, Object> getBillInfo() {
		return billInfo;
	}
	
	public void setBillId(String billId) {
		billInfo.put("billId", billId);
	}

}
