package com.xiaoshabao.bill.bd.service.impl;

import org.springframework.stereotype.Service;

import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.mapper.BillDao;
import com.xiaoshabao.bill.bd.service.BillService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-08-21
 */
@Service
public class BillServiceImpl extends BaseServiceMybatisImpl<BillDao, Bill> implements BillService {

}
