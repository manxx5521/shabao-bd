package com.xiaoshabao.bill.bd.d.service;

import java.util.ArrayList;
import java.util.List;

import com.xiaoshabao.bill.bd.d.bean.BillType;
import com.xiaoshabao.bill.bd.d.bean.FormContext;
import com.xiaoshabao.bill.bd.d.bean.SearchPlanDto;
import com.xiaoshabao.bill.bd.d.bean.SearchPlanVo;

public class SearchTemplateService {
	
	private ButtonService buttonService;
	
	public List<SearchPlanVo> getSearchTemplate(FormContext context,BillType billType) {
		
		List<SearchPlanDto> searchPlans=getSearchPlan(billType);
		List<SearchPlanVo> planList=new ArrayList<>(searchPlans.size());
		
		for(SearchPlanDto searchPlan:searchPlans) {
			
			SearchPlanVo  searchPlanVo=loadSearchPlan (searchPlan,context);
			planList.add(searchPlanVo);
		}
		
		
		
		
		return planList;
	}
	
	/**
	 * 单个审核方案装配
	 * @param searchPlan
	 * @param context
	 * @return
	 */
	private SearchPlanVo loadSearchPlan(SearchPlanDto searchPlan,FormContext context) {
		SearchPlanVo vo=new SearchPlanVo();
		String buttonTemaplate=this.buttonService.loadButtenTemplate(searchPlan, context);
		vo.setButtonTemaplate(buttonTemaplate);
		
		
		return vo;
	}
	
	/**
	 * 获得查询界面审核方案
	 * @param billType
	 * @return
	 */
	private List<SearchPlanDto> getSearchPlan(BillType billType){
		
		// TODO dao
		List<SearchPlanDto> dto=new ArrayList<SearchPlanDto>();
		
		return dto;
		
	}

}
