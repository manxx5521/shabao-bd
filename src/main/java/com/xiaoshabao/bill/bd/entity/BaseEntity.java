package com.xiaoshabao.bill.bd.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *	通用实体字段
 * </p>
 * @author manxx
 * @since 2018-12-04
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 排序
     */
    private Integer orderNo;

    /**
     * 更新的版本，锁
     */
    private Long lockVersion;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

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
    public Long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Bill{" +
        "version=" + version +
        ", orderNo=" + orderNo +
        ", lockVersion=" + lockVersion +
        ", updateTime=" + updateTime +
        "}";
    }
}
