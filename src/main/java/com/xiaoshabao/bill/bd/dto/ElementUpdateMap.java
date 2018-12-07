package com.xiaoshabao.bill.bd.dto;

import java.util.HashMap;

public class ElementUpdateMap<K, V> extends HashMap<K, V>{

	private static final long serialVersionUID = 1L;
	
	private Boolean elementUpdateType;

	public Boolean getElementUpdateType() {
		return elementUpdateType;
	}

	public void setElementUpdateType(Boolean elementUpdateType) {
		this.elementUpdateType = elementUpdateType;
	}
	

}
