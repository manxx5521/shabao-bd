package com.xiaoshabao.bill.bd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import com.xiaoshabao.bill.bd.dto.BillSaveData;
import com.xiaoshabao.bill.bd.dto.SQLContants;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.mapper.BillMapper;
import com.xiaoshabao.bill.bd.mapper.DynamicSqlMapper;
import com.xiaoshabao.bill.bd.service.IBillService;

/**
 * <p>
 * 单据 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-04
 */
@Service
public class BillServiceImpl extends BaseServiceMybatisImpl<BillMapper, Bill> implements IBillService {

	@Autowired
	private DynamicSqlMapper sqlMapper;
	@Override
	public Bill getBillById(Long billId) {
		return this.baseMapper.getBillById(billId);
	}

	@Override
	@Transactional
	public void saveBill(Long billId, BillSaveData data) {
		if(data.getBillUpdateType()!=null){
			if(data.getBillUpdateType()){
				sqlMapper.updateSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, data.getBill(), SQLContants.Table.BILL_ID);
			}else{
				sqlMapper.insertSQL(BillMapper.class.getName(), SQLContants.Table.BILL_TABLE, data.getBill());
			}
		}

	}

}
