package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.mapper.BillMapper;
import com.xiaoshabao.bill.bd.service.IBillService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import org.springframework.stereotype.Service;

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

}
