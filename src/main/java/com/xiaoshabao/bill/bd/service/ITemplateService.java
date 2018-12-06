package com.xiaoshabao.bill.bd.service;

import java.util.Optional;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoshabao.bill.bd.dto.TemplateDto;
import com.xiaoshabao.bill.bd.entity.Template;

/**
 * <p>
 * 模版表 服务类
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
public interface ITemplateService extends IService<Template> {
	
	/**
	 * 根据模版加载模版业务数据
	 * @param templateId
	 * @return
	 */
	Optional<TemplateDto> getTemplateDto(Long templateId,Integer version);

}
