package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.entity.Template;
import com.xiaoshabao.bill.bd.mapper.TemplateMapper;
import com.xiaoshabao.bill.bd.service.ITemplateService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 模版表 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@Service
public class TemplateServiceImpl extends BaseServiceMybatisImpl<TemplateMapper, Template> implements ITemplateService {

}
