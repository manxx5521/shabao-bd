package com.xiaoshabao.bill.bd.d.controller;

import com.xiaoshabao.bill.bd.d.bean.FormDataVo;
import com.xiaoshabao.bill.bd.d.bean.FormViewQuery;
import com.xiaoshabao.bill.bd.d.bean.FormViewVo;

public class FormController {
	
	public FormViewVo getFormViewTemplate(FormViewQuery query) {
		FormViewVo vo=new FormViewVo();
		return vo;
	}
	
	public FormDataVo getFormData() {
		FormDataVo vo=new FormDataVo();
		
		return vo;
	}

}
