package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

@TableName("td_ui_bill")
@ApiModel(description="单据")
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="单据id",example="CS001")
    private String billId;
    
    @ApiModelProperty(value="单据名字",example="测试单据名称")
    @NotEmpty(message="单据名字不能为空")
    private String billName;

    /**
     * 分类
     */
    @ApiModelProperty(value="分类",example="TEST")
    private String billClass;

    @ApiModelProperty(value="使用的单据引擎",example="simple")
    private String billEngine;

    @ApiModelProperty(value="排序",example="100")
    private Integer orderNo;

    @ApiModelProperty(value="状态",example="1")
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
