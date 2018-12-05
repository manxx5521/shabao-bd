package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshabao.bill.bd.entity.BaseEntity;

/**
 * <p>
 * 模版元素
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_template_element")
public class TemplateElement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 模版id
     */
    private Long templateId;

    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 元素id
     */
    private Integer elementId;

    /**
     * 表单显示
     */
    private String label;

    /**
     * 可能存在的个性参数
     */
    private String extParams;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 是否必填1是，0否
     */
    private Integer required;

    /**
     * 最大长度
     */
    private Integer maxLength;

    /**
     * 最小长度
     */
    private Integer minLength;

    /**
     * 只读
     */
    private Integer readOnly;

    /**
     * 是否显示
     */
    private Integer display;

    /**
     * 描述
     */
    private String remark;

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getExtParams() {
        return extParams;
    }

    public void setExtParams(String extParams) {
        this.extParams = extParams;
    }
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }
    public Integer getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }
    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TemplateElement{" +
        "templateId=" + templateId +
        ", fieldName=" + fieldName +
        ", elementId=" + elementId +
        ", label=" + label +
        ", extParams=" + extParams +
        ", defaultValue=" + defaultValue +
        ", required=" + required +
        ", maxLength=" + maxLength +
        ", minLength=" + minLength +
        ", readOnly=" + readOnly +
        ", display=" + display +
        ", remark=" + remark +
        "}";
    }
}
