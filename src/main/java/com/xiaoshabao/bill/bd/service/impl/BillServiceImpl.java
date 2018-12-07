package com.xiaoshabao.bill.bd.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import com.xiaoshabao.bill.bd.dto.BillSaveData;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.mapper.BillMapper;
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
	private BillMapper billMapper;
	
	@Override
	public Bill getBillById(Long billId) {
//		sqlSession.getConfiguration().getMappedStatement(id)
//		sqlSession.selectList("getBillById", billId);
		return billMapper.getBillById(billId);
	}

	@Override
	public void saveBill(Long billId, BillSaveData data) {

	}

}
