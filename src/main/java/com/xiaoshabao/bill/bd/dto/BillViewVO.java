package com.xiaoshabao.bill.bd.dto;

import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.entity.ListView;

public class BillViewVO extends Bill {

	private static final long serialVersionUID = 1L;

	private boolean success = true;

	private String message;

	private ListView listView;

	private TemplateDto searchTemplate;
	
	private TemplateDto reportTemplate;


	public static BillViewVO fail(String message) {
		BillViewVO result = new BillViewVO();
		result.setSuccess(false);
		result.setMessage(message);
		return result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ListView getListView() {
		return listView;
	}

	public void setListView(ListView listView) {
		this.listView = listView;
	}

	public TemplateDto getSearchTemplate() {
		return searchTemplate;
	}

	public void setSearchTemplate(TemplateDto searchTemplate) {
		this.searchTemplate = searchTemplate;
	}

	public TemplateDto getReportTemplate() {
		return reportTemplate;
	}

	public void setReportTemplate(TemplateDto reportTemplate) {
		this.reportTemplate = reportTemplate;
	}
	
}
