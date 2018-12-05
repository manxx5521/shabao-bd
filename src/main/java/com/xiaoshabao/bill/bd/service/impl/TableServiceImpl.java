package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.entity.Table;
import com.xiaoshabao.bill.bd.mapper.TableMapper;
import com.xiaoshabao.bill.bd.service.ITableService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据表 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@Service
public class TableServiceImpl extends BaseServiceMybatisImpl<TableMapper, Table> implements ITableService {

}
