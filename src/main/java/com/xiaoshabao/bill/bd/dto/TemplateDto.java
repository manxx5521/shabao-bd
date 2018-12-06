package com.xiaoshabao.bill.bd.dto;

import java.util.List;

import com.xiaoshabao.bill.bd.entity.Template;
import com.xiaoshabao.bill.bd.entity.TemplateElement;

/**
 * 模版业务数据
 */
public class TemplateDto{
	
	private Template template;
	
	private List<TemplateElement> elements;

	public List<TemplateElement> getElements() {
		return elements;
	}

	public void setElements(List<TemplateElement> elements) {
		this.elements = elements;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}
	
}
