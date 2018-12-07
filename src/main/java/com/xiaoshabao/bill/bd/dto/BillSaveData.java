package com.xiaoshabao.bill.bd.dto;

import java.util.List;
import java.util.Map;

public class BillSaveData {
	
	private Map<String,Object> bill;
	
	private Map<String,Object> listView;
	
	private Map<String,Object> listTemplate;
	
	private List<Map<String, Object>> listElements;

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

	public List<Map<String, Object>> getListElements() {
		return listElements;
	}

	public void setListElements(List<Map<String, Object>> listElements) {
		this.listElements = listElements;
	}

}
