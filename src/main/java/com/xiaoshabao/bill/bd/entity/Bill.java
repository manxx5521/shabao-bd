package com.xiaoshabao.bill.bd.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 单据
 * </p>
 *
 * @author manxx
 * @since 2018-12-04
 */
@TableName("ui_bill")
public class Bill extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单据主键
     */
    private Long billId;

    /**
     * 单据名称
     */
    private String billName;

    /**
     * 单据类型，1简单，2组合
     */
    private Integer billType;

    /**
     * 状态
     */
    private Integer status;

    public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" +
        "billId=" + billId +
        ", billName=" + billName +
        ", billType=" + billType +
        ", status=" + status +
        ", version=" + this.getVersion() +
        ", orderNo=" + this.getOrderNo() +
        ", lockVersion=" + this.getLockVersion() +
        ", updateTime=" + this.getUpdateTime() +
        "}";
    }
}
