package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author manxx
 * @since 2018-10-31
 */
@TableName("td_ui_bill")
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单据主键
     */
    private String billId;

    /**
     * 单据名称
     */
    private String billName;

    /**
     * 分类
     */
    private String billClass;

    /**
     * 使用引擎
     */
    private String billEngine;

    /**
     * 排序
     */
    private Integer orderNo;

    /**
     * 状态
     */
    private Integer state;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }
    public String getBillClass() {
        return billClass;
    }

    public void setBillClass(String billClass) {
        this.billClass = billClass;
    }
    public String getBillEngine() {
        return billEngine;
    }

    public void setBillEngine(String billEngine) {
        this.billEngine = billEngine;
    }
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bill{" +
        "billId=" + billId +
        ", billName=" + billName +
        ", billClass=" + billClass +
        ", billEngine=" + billEngine +
        ", orderNo=" + orderNo +
        ", state=" + state +
        "}";
    }
}
