package com.xiaoshabao.bill.bd.util;

import org.springframework.beans.BeanUtils;

import com.xiaoshabao.bill.bd.dto.BillViewVO;
import com.xiaoshabao.bill.bd.entity.Bill;

public class BillBeanUtil {
	
	public static void copy(Bill bill,BillViewVO viewVo) {
		BeanUtils.copyProperties(bill, viewVo);
	}

}
