package com.xiaoshabao.bill.bd.d.service;

import java.util.ArrayList;
import java.util.List;

import com.xiaoshabao.bill.bd.d.bean.BillType;
import com.xiaoshabao.bill.bd.d.bean.FormContext;
import com.xiaoshabao.bill.bd.d.bean.TemplateDto;
import com.xiaoshabao.bill.bd.d.bean.TemplatePlanDto;
import com.xiaoshabao.bill.bd.d.bean.TemplateViewVo;

public class ViewTemplateSevice {
	
	private GridService gridService;
	private ElementService  elementService;

	public TemplateDto getTemplate(FormContext context, BillType billType) {
		
		TemplateDto result=new TemplateDto();

		List<TemplatePlanDto> templatePlans = getTemplatePlan(billType);
		
		List<TemplateViewVo> viewList=new ArrayList<>(templatePlans.size());
		StringBuffer tempalte=new StringBuffer();
		for (TemplatePlanDto templatePlan : templatePlans) {

			TemplateViewVo viewDto=getTemplateSingle(context,templatePlan);
			viewList.add(viewDto);
			
			//分栏 html添加
			tempalte.append(viewDto.getTemplate());
		}

		return result;
	}
	
	public TemplateViewVo getTemplateSingle(FormContext context, TemplatePlanDto templatePlan) {
		
		TemplateViewVo viewDto=new TemplateViewVo();
		
		if("grid".equals(templatePlan.getType())) {
			gridService.getTableTempalte(context, templatePlan, viewDto);
		}else {
			elementService.getElementTempalte(context, templatePlan, viewDto);
		}

		return viewDto;
	}
	
	
	/**
	 * 获得元素界面方案
	 * @param billType
	 * @return
	 */
	private List<TemplatePlanDto> getTemplatePlan(BillType billType){
		
		// TODO dao
		List<TemplatePlanDto> dto=new ArrayList<>();
		
		return dto;
		
	}

}
