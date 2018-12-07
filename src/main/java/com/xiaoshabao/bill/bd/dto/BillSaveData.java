package com.xiaoshabao.bill.bd.dto;

import java.util.List;
import java.util.Map;

public class BillSaveData {
	private Boolean billUpdateType;
	private Map<String,Object> bill;
	
	private Boolean listViewUpdateType;
	private Map<String,Object> listView;
	
	private Boolean listTemplateUpdateType;
	private Map<String,Object> listTemplate;
	
	private List<ElementUpdateMap<String, Object>> listElements;

	public Map<String, Object> getBill() {
		return bill;
	}

	public void setBill(Map<String, Object> bill) {
		this.bill = bill;
	}

	public Map<String, Object> getListView() {
		return listView;
	}

	public void setListView(Map<String, Object> listView) {
		this.listView = listView;
	}

	public Map<String, Object> getListTemplate() {
		return listTemplate;
	}

	public void setListTemplate(Map<String, Object> listTemplate) {
		this.listTemplate = listTemplate;
	}

	public Boolean getBillUpdateType() {
		return billUpdateType;
	}

	public void setBillUpdateType(Boolean billUpdateType) {
		this.billUpdateType = billUpdateType;
	}

	public Boolean getListViewUpdateType() {
		return listViewUpdateType;
	}

	public void setListViewUpdateType(Boolean listViewUpdateType) {
		this.listViewUpdateType = listViewUpdateType;
	}

	public Boolean getListTemplateUpdateType() {
		return listTemplateUpdateType;
	}

	public void setListTemplateUpdateType(Boolean listTemplateUpdateType) {
		this.listTemplateUpdateType = listTemplateUpdateType;
	}

	public List<ElementUpdateMap<String, Object>> getListElements() {
		return listElements;
	}

	public void setListElements(List<ElementUpdateMap<String, Object>> listElements) {
		this.listElements = listElements;
	}


}
