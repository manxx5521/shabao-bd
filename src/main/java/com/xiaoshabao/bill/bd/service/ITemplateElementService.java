package com.xiaoshabao.bill.bd.service;

import com.xiaoshabao.bill.bd.entity.TemplateElement;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 模版元素 服务类
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
public interface ITemplateElementService extends IService<TemplateElement> {
	
	/**
	 * 根据模板id获得元素
	 * @param templateId
	 * @return
	 */
	List<TemplateElement> getTemplateElementsByTemplateId(Long templateId,Integer version);

}
