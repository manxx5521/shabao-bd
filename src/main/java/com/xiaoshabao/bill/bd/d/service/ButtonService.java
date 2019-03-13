package com.xiaoshabao.bill.bd.d.service;

import java.util.ArrayList;
import java.util.List;

import com.xiaoshabao.bill.bd.d.bean.ButtonDto;
import com.xiaoshabao.bill.bd.d.bean.FormContext;
import com.xiaoshabao.bill.bd.d.bean.SearchPlanDto;
import com.xiaoshabao.bill.bd.d.util.FreemarkerUtil;

public class ButtonService {
	
	public String loadButtenTemplate(SearchPlanDto searchPlan,FormContext context) {
		
		
		StringBuffer template=new StringBuffer();
		//TODO dao
		List<ButtonDto> buttonDtos=new ArrayList<>();
		
		for(ButtonDto buttonDto:buttonDtos) {
			
			String rs=FreemarkerUtil.getButtonTemplate(buttonDto);
			template.append(rs);
		}
		
		return template.toString();
	}

}
