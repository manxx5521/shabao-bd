package com.xiaoshabao.bill.bd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoshabao.bill.bd.dto.BillViewVO;
import com.xiaoshabao.bill.bd.dto.PageDataAnt;
import com.xiaoshabao.bill.bd.dto.SQLContants;
import com.xiaoshabao.bill.bd.entity.Bill;
import com.xiaoshabao.bill.bd.service.IBillService;
import com.xiaoshabao.bill.bd.service.IListViewService;
import com.xiaoshabao.bill.bd.util.BillBeanUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author manxx
 * @since 2018-08-21
 */
@Api(value = "单据类型controller", tags = "单据设计")
@RestController
@RequestMapping("/bill")
@Validated
public class BillController {

	@Autowired
	private IBillService billService;
	@Autowired
	private IListViewService listViewService;

	@ApiOperation(value = "单据列表", notes = "返回排序的单据列表")
	@GetMapping("/billList")
	public PageDataAnt getBillList() {
		Page<Bill> page = new Page<Bill>();
		billService.page(page, new QueryWrapper<Bill>().orderByAsc(SQLContants.ORDER_NO_STR));
		return new PageDataAnt(page);
	}
	
	@ApiOperation(value = "新增单据列表", notes = "返回排序的单据列表",produces = "application/json")
	@PostMapping("/billList")
//	@CacheLock("bill-billList")//自定义防止重复提交
	public Boolean addBillList(/*@Validated */@RequestBody Bill bill,HttpServletRequest request) {
		boolean result=this.billService.save(bill);
		return result;
	}
	
	
	
	@ApiOperation(value = "单据信息", notes = "返回单据配置信息")
	@GetMapping("/billView")
	@ApiImplicitParam(name="billId",value="单据主键",paramType="query",required=true,example="100")
	public BillViewVO getBillView(@RequestParam String billId) {
		Bill bill=billService.getById(billId);
		if(bill==null) {
			return BillViewVO.fail("当前单据id"+billId+"不存在");
		}
		BillViewVO vo=new BillViewVO();
		BillBeanUtil.copy(bill, vo);
		
		listViewService.loadListView(vo);
		return vo;
	}
	
	
	

	
	
	
	

}
