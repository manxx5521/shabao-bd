package com.xiaoshabao.bill.bd.mapper;

import com.xiaoshabao.bill.bd.entity.Template;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 模版表 Mapper 接口
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
public interface TemplateMapper extends BaseMapper<Template> {
	/**
	 * 获取模版
	 * @param templateId
	 * @param version
	 * @return
	 */
	@Select("select * from ui_template where template_id=#{templateId} and version=#{version}")
	Template getTemplate(Long templateId, Integer version);

}
