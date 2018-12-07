package com.xiaoshabao.bill.bd.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoshabao.bill.bd.entity.Bill;

/**
 * <p>
 * 单据 Mapper 接口
 * </p>
 *
 * @author manxx
 * @since 2018-12-04
 */
public interface BillMapper extends BaseMapper<Bill> {
	
	/**
	 * 根据id获得实体
	 * @param billId
	 * @return
	 */
	@Select("select * from ui_bill where bill_id=#{billId}")
	Bill getBillById(@Param("billId")Long billId);

}
