package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 数据表
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_table")
public class Table implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据表id
     */
    private String tableId;

    /**
     * 显示描述
     */
    private String displayName;

    /**
     * 数据表名
     */
    private String tableName;

    /**
     * 数据表类型,1数据表2视图
     */
    private String tableType;

    /**
     * 备注
     */
    private String remark;

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Table{" +
        "tableId=" + tableId +
        ", displayName=" + displayName +
        ", tableName=" + tableName +
        ", tableType=" + tableType +
        ", remark=" + remark +
        "}";
    }
}
