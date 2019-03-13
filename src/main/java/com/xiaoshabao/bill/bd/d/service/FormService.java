package com.xiaoshabao.bill.bd.d.service;

import com.xiaoshabao.bill.bd.d.bean.BillType;
import com.xiaoshabao.bill.bd.d.bean.FormContext;
import com.xiaoshabao.bill.bd.d.bean.FormDataVo;
import com.xiaoshabao.bill.bd.d.bean.FormSession;
import com.xiaoshabao.bill.bd.d.bean.FormViewQuery;
import com.xiaoshabao.bill.bd.d.bean.FormViewVo;

public class FormService {
	private FormSystemSetting formSystemSetting;
	
	private BillTypeService billTypeService;
	
	private SearchTemplateService searchTemplateService;
	
	public FormViewVo getFormViewTemplate(FormViewQuery query,FormSession session) {
		FormViewVo vo=new FormViewVo();
		
		FormContext context=new FormContext();
		context.setSetting(formSystemSetting.getSystemSetting());
		context.setSession(session);
		
		//设置版本
		context.setVersion("2018");
		
		
		BillType billType=billTypeService.getBillTypeById(query.getBillId(), context.getVersion());
		
		searchTemplateService.getSearchTemplate(context, billType);
		
		
		
		
		
		
		
		return vo;
	}
	
	public FormDataVo getFormData() {
		FormDataVo vo=new FormDataVo();
		
		return vo;
	}

}
