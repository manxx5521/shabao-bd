package com.xiaoshabao.bill.bd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshabao.bill.bd.entity.BaseEntity;

/**
 * <p>
 * 列表视图
 * </p>
 *
 * @author manxx
 * @since 2018-12-05
 */
@TableName("ui_list")
public class List extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 列表id
     */
    private Long listId;

    /**
     * 列表名称
     */
    private String listName;

    /**
     * 单据id
     */
    private Long billId;

    /**
     * 查询条件模版id
     */
    private Long searchId;

    /**
     * 查询表模版id
     */
    private Long reportId;

    /**
     * 是否直接查询数据
     */
    private Boolean query;

    /**
     * 取数条件
     */
    private String dataWhere;

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }
    
    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }
    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }
    public Boolean getQuery() {
        return query;
    }

    public void setQuery(Boolean query) {
        this.query = query;
    }
    public String getDataWhere() {
        return dataWhere;
    }

    public void setDataWhere(String dataWhere) {
        this.dataWhere = dataWhere;
    }

    @Override
    public String toString() {
        return "List{" +
        "listId=" + listId +
        ", listName=" + listName +
        ", billId=" + billId +
        ", searchId=" + searchId +
        ", reportId=" + reportId +
        ", query=" + query +
        ", dataWhere=" + dataWhere +
        "}";
    }
}
