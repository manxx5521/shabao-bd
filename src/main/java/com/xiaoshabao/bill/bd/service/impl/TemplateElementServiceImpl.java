package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.entity.TemplateElement;
import com.xiaoshabao.bill.bd.mapper.TemplateElementMapper;
import com.xiaoshabao.bill.bd.service.ITemplateElementService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 模版元素 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@Service
public class TemplateElementServiceImpl extends BaseServiceMybatisImpl<TemplateElementMapper, TemplateElement> implements ITemplateElementService {

	@Override
	public List<TemplateElement> getTemplateElementsByTemplateId(Long templateId,Integer version) {
		return this.baseMapper.getTemplateElementsByTemplateId(templateId, version);
	}

}
