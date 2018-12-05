package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_table_column")
public class TableColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据表id
     */
    private Long tableId;

    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 字段描述
     */
    private String fieldDesc;

    /**
     * 数据类型
     */
    private Integer fieldType;

    /**
     * 属性，1-CODE，2-value
     */
    private Integer fieldAttr;

    /**
     * 数据长度
     */
    private Integer fieldLength;

    /**
     * 小数为长度
     */
    private Integer fieldDecimal;

    /**
     * 是否主键
     */
    private Boolean primary;

    /**
     * 是否必须
     */
    private Boolean required;

    /**
     * 有引用关联表
     */
    private Boolean reference;

    /**
     * 关联表id
     */
    private Long refTable;

    /**
     * 备注
     */
    private String remark;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }
    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }
    public Integer getFieldAttr() {
        return fieldAttr;
    }

    public void setFieldAttr(Integer fieldAttr) {
        this.fieldAttr = fieldAttr;
    }
    public Integer getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
    }
    public Integer getFieldDecimal() {
        return fieldDecimal;
    }

    public void setFieldDecimal(Integer fieldDecimal) {
        this.fieldDecimal = fieldDecimal;
    }
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
    public Boolean getReference() {
        return reference;
    }

    public void setReference(Boolean reference) {
        this.reference = reference;
    }
    public Long getRefTable() {
        return refTable;
    }

    public void setRefTable(Long refTable) {
        this.refTable = refTable;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TableColumn{" +
        "tableId=" + tableId +
        ", fieldName=" + fieldName +
        ", fieldDesc=" + fieldDesc +
        ", fieldType=" + fieldType +
        ", fieldAttr=" + fieldAttr +
        ", fieldLength=" + fieldLength +
        ", fieldDecimal=" + fieldDecimal +
        ", primary=" + primary +
        ", required=" + required +
        ", reference=" + reference +
        ", refTable=" + refTable +
        ", remark=" + remark +
        "}";
    }
}
