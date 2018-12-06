package com.xiaoshabao.bill.bd.mapper;

import com.xiaoshabao.bill.bd.entity.ListView;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 列表视图 Mapper 接口
 * </p>
 *
 * @author manxx
 * @since 2018-12-06
 */
public interface ListViewMapper extends BaseMapper<ListView> {
	
	@Select("select * from ui_list_view where bill_id=#{billId} and version=#{version}")
	ListView getListViewByBillId(@Param("version") Long billId,Integer version);

}
