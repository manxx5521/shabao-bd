package com.xiaoshabao.bill.bd.d.bean;

/**
 */
public class FormContext {
	
	private FormSession session;
	
	private FormSetting setting;
	
	private String version;

	public FormSetting getSetting() {
		return setting;
	}

	public void setSetting(FormSetting setting) {
		this.setting = setting;
	}

	public FormSession getSession() {
		return session;
	}

	public void setSession(FormSession session) {
		this.session = session;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	

}
