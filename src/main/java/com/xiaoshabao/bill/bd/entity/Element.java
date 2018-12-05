package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 表单元素
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_element")
public class Element implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 元素id
     */
    private Integer elementId;

    /**
     * 类型 tree，select等
     */
    private String elementType;

    /**
     * 元素名字
     */
    private String elementName;

    /**
     * 描述
     */
    private String elementDesc;

    /**
     * 参数
     */
    private String params;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 排序
     */
    private Integer orderNo;

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }
    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
    public String getElementDesc() {
        return elementDesc;
    }

    public void setElementDesc(String elementDesc) {
        this.elementDesc = elementDesc;
    }
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Element{" +
        "elementId=" + elementId +
        ", elementType=" + elementType +
        ", elementName=" + elementName +
        ", elementDesc=" + elementDesc +
        ", params=" + params +
        ", version=" + version +
        ", orderNo=" + orderNo +
        "}";
    }
}
