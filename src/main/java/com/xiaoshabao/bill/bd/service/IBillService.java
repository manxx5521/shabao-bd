package com.xiaoshabao.bill.bd.service;

import com.xiaoshabao.bill.bd.dto.BillSaveData;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 单据 服务类
 * </p>
 *
 * @author manxx
 * @since 2018-12-04
 */
public interface IBillService extends IService<Bill> {
	
	/**
	 * 根据id获得实体
	 * @param billId
	 * @return
	 */
	Bill getBillById(Long billId);
	/**
	 * 保存单据
	 * @param billId
	 * @param data
	 */
	void saveBill(Long billId,BillSaveData data);

}
