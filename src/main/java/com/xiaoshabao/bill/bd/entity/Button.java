package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 按钮
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_button")
public class Button implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 按钮代码
     */
    private String buttonId;

    /**
     * 按钮描述
     */
    private String buttonName;

    /**
     * 按钮类型
     */
    private Integer buttonType;

    /**
     * 图片id
     */
    private Integer imageId;

    /**
     * 适用范围,自右到左分别为：列表，编辑
     */
    private String buttonFrame;

    /**
     * 排序
     */
    private Integer orderNo;

    /**
     * 是否使用
     */
    private Integer used;

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
    public Integer getButtonType() {
        return buttonType;
    }

    public void setButtonType(Integer buttonType) {
        this.buttonType = buttonType;
    }
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
    public String getButtonFrame() {
        return buttonFrame;
    }

    public void setButtonFrame(String buttonFrame) {
        this.buttonFrame = buttonFrame;
    }
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Button{" +
        "buttonId=" + buttonId +
        ", buttonName=" + buttonName +
        ", buttonType=" + buttonType +
        ", imageId=" + imageId +
        ", buttonFrame=" + buttonFrame +
        ", orderNo=" + orderNo +
        ", used=" + used +
        "}";
    }
}
