package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshabao.bill.bd.entity.BaseEntity;

/**
 * <p>
 * 模版表
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_template")
public class Template extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 模版id
     */
    private Long templateId;

    /**
     * 模版名字
     */
    private String templateName;

    /**
     * 模版引用数据源
     */
    private Long tableId;

    /**
     * 单据类型，1卡片，2明细
     */
    private String templateType;

    /**
     * 是否显示
     */
    private Boolean visible;

    /**
     * 分栏数
     */
    private String colCount;

    /**
     * 模版描述
     */
    private String remark;

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    public String getColCount() {
        return colCount;
    }

    public void setColCount(String colCount) {
        this.colCount = colCount;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Template{" +
        "templateId=" + templateId +
        ", templateName=" + templateName +
        ", tableId=" + tableId +
        ", templateType=" + templateType +
        ", visible=" + visible +
        ", colCount=" + colCount +
        ", remark=" + remark +
        "}";
    }
}
