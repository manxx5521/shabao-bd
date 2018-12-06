package com.xiaoshabao.bill.bd.mapper;

import com.xiaoshabao.bill.bd.entity.TemplateElement;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 模版元素 Mapper 接口
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
public interface TemplateElementMapper extends BaseMapper<TemplateElement> {

	@Select("select * from ui_template_element where template_id=#{templateId} and version=#{version} order by order_no")
	List<TemplateElement> getTemplateElementsByTemplateId(Long templateId, Integer version);

}
