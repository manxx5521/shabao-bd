package com.xiaoshabao.bill.bd.dto;

public interface SQLContants {
	
	interface Table{
		String BILL_TABLE="ui_bill";
		String BILL_ID="bill_id";
	}
	
	/**mybatis基础字段map*/
	String BASE_RESULT_MAP="BaseResultMap";
	/**通用排序字段标识*/
	String ORDER_NO_STR="ORDER_NO";
	
	String UPDATE_TYPE_STR="";

}
