package com.xiaoshabao.bill.bd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;
import com.xiaoshabao.bill.bd.dto.BillViewVO;
import com.xiaoshabao.bill.bd.entity.ListView;
import com.xiaoshabao.bill.bd.mapper.ListViewMapper;
import com.xiaoshabao.bill.bd.service.IListViewService;
import com.xiaoshabao.bill.bd.service.ITemplateService;

/**
 * <p>
 * 列表视图 服务实现类
 * </p>
 *
 * @author manxx
 * @since 2018-12-06
 */
@Service
public class ListViewServiceImpl extends BaseServiceMybatisImpl<ListViewMapper, ListView> implements IListViewService {
	@Autowired
	private ITemplateService templateService;
	@Override
	public void loadListViewD(BillViewVO vo) {
		Integer version=vo.getVersion();
		ListView listView=this.baseMapper.getListViewByBillId(vo.getBillId(),version);
		if(listView==null) {
			return;
		}
		vo.setListView(listView);
		
		//加载查询
		templateService.getTemplateDto(listView.getSearchId(), version).ifPresent(v->vo.setSearchTemplate(v));
		// 加载表格
		templateService.getTemplateDto(listView.getReportId(), version).ifPresent(v->vo.setReportTemplate(v));
	}

}
