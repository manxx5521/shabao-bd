package com.xiaoshabao.bill.bd.d.bean;

import java.util.List;

public class TemplateDto {
	
	private List<TemplateViewVo> viewDtos;
	
	private transient String tempalte;

	public List<TemplateViewVo> getViewDtos() {
		return viewDtos;
	}

	public void setViewDtos(List<TemplateViewVo> viewDtos) {
		this.viewDtos = viewDtos;
	}

	public String getTempalte() {
		return tempalte;
	}

	public void setTempalte(String tempalte) {
		this.tempalte = tempalte;
	}
	
	

}
