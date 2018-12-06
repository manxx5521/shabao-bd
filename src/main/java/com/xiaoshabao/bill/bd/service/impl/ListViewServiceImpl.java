package com.xiaoshabao.bill.bd.service.impl;

import com.xiaoshabao.bill.bd.dto.BillViewVO;
import com.xiaoshabao.bill.bd.dto.TemplateDto;
import com.xiaoshabao.bill.bd.entity.ListView;
import com.xiaoshabao.bill.bd.mapper.ListViewMapper;
import com.xiaoshabao.bill.bd.service.IListViewService;
import com.xiaoshabao.bill.bd.service.ITemplateService;
import com.xiaoshabao.base.mybatis.service.impl.BaseServiceMybatisImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void loadListView(BillViewVO vo) {
		Integer version=vo.getVersion();
		ListView listView=this.baseMapper.getListViewByBillId(vo.getBillId(),version);
		if(listView==null) {
			return;
		}
		vo.setListView(listView);
		
		//加载查询
		Optional<TemplateDto> searchDto=templateService.getTemplateDto(listView.getSearchId(), version);
		if(searchDto.isPresent()) {
			vo.setSearchTemplate(searchDto.get());
		}
		// 加载表格
		Optional<TemplateDto> reportDto = templateService.getTemplateDto(listView.getReportId(), version);
		if (reportDto.isPresent()) {
			vo.setSearchTemplate(reportDto.get());
		}
	}

}
