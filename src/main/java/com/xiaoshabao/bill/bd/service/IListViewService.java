package com.xiaoshabao.bill.bd.service;

import com.xiaoshabao.bill.bd.dto.BillViewVO;
import com.xiaoshabao.bill.bd.entity.ListView;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 列表视图 服务类
 * </p>
 *
 * @author manxx
 * @since 2018-12-06
 */
public interface IListViewService extends IService<ListView> {
	
	/**
	 * 加载列表视图
	 * @param vo
	 */
	void loadListViewD(BillViewVO vo);

}
