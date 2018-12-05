package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshabao.bill.bd.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_list_button")
public class ListButton extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long listId;

    private String buttonId;

    private String label;

    private Integer used;

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }
    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "ListButton{" +
        "listId=" + listId +
        ", buttonId=" + buttonId +
        ", label=" + label +
        ", used=" + used +
        "}";
    }
}
