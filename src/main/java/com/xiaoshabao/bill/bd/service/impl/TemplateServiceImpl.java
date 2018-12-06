package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.dto.TemplateDto;
import com.xiaoshabao.bill.bd.entity.Template;
import com.xiaoshabao.bill.bd.mapper.TemplateMapper;
import com.xiaoshabao.bill.bd.service.ITemplateElementService;
import com.xiaoshabao.bill.bd.service.ITemplateService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private ITemplateElementService templateElementService;
	@Override
	public Optional<TemplateDto> getTemplateDto(Long templateId,Integer version) {
		Template template=this.baseMapper.getTemplate(templateId, version);
		if(template==null) {
			return Optional.empty();
		}
		TemplateDto dto=new TemplateDto();
		dto.setTemplate(template);
		dto.setElements(templateElementService.getTemplateElementsByTemplateId(templateId, version));
		return Optional.of(dto);
	}

}
