package com.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DestoryDao;
import com.oa.dao.PropertyDao;
import com.oa.pojo.Destory;
import com.oa.pojo.Property;
import com.oa.service.DestoryService;
import com.oa.vo.DestoryVO;

@Service
public class DestoryServiceImpl implements DestoryService {

	@Autowired
	private DestoryDao DestoryDao;
	@Autowired
	private PropertyDao propertyDao;

	private List<DestoryVO> list_vo = new ArrayList<DestoryVO>();

	
	public void change(List<DestoryVO> list_vo, List<Destory> list) {
		for (Destory destory : list) {
			Property property = propertyDao.findById(destory.getIid());
			String Kname = property.getIname();
			String ktype = property.getIclass();
			String kmold = property.getItype();
			DestoryVO destoryVO = new DestoryVO(destory.getPid(), destory.getIid(), destory.getPcount(),
					destory.getPreason(), kmold, ktype, Kname);
			list_vo.add(destoryVO);
		}
	}

	public DestoryVO changePV(Destory destory) {
		DestoryVO destoryVO = new DestoryVO(destory.getPid(), destory.getIid(), destory.getPcount(),
				destory.getPreason(), propertyDao.findById(destory.getIid()).getItype(),
				propertyDao.findById(destory.getIid()).getIclass(), propertyDao.findById(destory.getIid()).getIname());
		return destoryVO;

	}

	@Override
	public List<DestoryVO> findAll() {
		List<Destory> list = DestoryDao.findAll();
		change(list_vo, list);
		return list_vo;
	}

	@Override
	public DestoryVO select(int id) {
		return changePV(DestoryDao.select(id));
	}
	
	@Override
	public boolean insert(Destory destory) {
		return DestoryDao.insert(destory) > 0 ? true : false;
	}

	@Override
	public boolean delete(int pid) {
		return DestoryDao.delete(pid) > 0 ? true : false;
	}

	@Override
	public boolean update(Destory destory) {
		return DestoryDao.update(destory) > 0 ? true : false;
	}

	

}
