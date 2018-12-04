package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.entity.List;
import com.xiaoshabao.bill.bd.mapper.ListMapper;
import com.xiaoshabao.bill.bd.service.IListService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 列表视图 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-04
 */
@Service
public class ListServiceImpl extends BaseServiceMybatisImpl<ListMapper, List> implements IListService {

}
