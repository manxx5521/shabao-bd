package com.xiaoshabao.bill.bd.dto;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;

public class PageDataAnt {
	
	private List<?> list;
	
	private PaginationAnt pagination;
	
	public PageDataAnt(Page<?> page) {
		this.list=page.getRecords();
		PaginationAnt p=new PaginationAnt();
		p.setTotal(page.getTotal());
		p.setPageSize(page.getSize());
		p.setCurrent(page.getCurrent());
		this.pagination=p;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public PaginationAnt getPagination() {
		return pagination;
	}

	public void setPagination(PaginationAnt pagination) {
		this.pagination = pagination;
	}

}
