package com.xiaoshabao.bill.bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.xiaoshabao.bill.bd.dto.PageDataAnt;
import com.xiaoshabao.bill.bd.dto.SQLContants;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.service.BillService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author manxx
 * @since 2018-08-21
 */
@Api(value="单据类型controller",tags="单据设计")
@RestController
@RequestMapping("/bill")
public class BillController {

	@Autowired
	private BillService billService;
	
	@ApiOperation(value="单据列表",notes="返回排序的单据列表")
	@GetMapping("/billList")
	public PageDataAnt getBillList() {
		Page<Bill> page=new Page<Bill>();
		billService.selectPage(page,new EntityWrapper<Bill>().orderBy(SQLContants.ORDER_NO_STR));
		return new PageDataAnt(page);
	}

}
