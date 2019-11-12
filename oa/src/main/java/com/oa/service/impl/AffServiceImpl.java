package com.oa.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.AffDao;
import com.oa.pojo.Aff;
import com.oa.service.AffService;

/**
 * @author cjg
 * @category 通知公告业务逻辑实现类
 */
@Service
public class AffServiceImpl implements AffService {

	@Autowired
	private AffDao affDao;

	@Override
	public List<Aff> findAll() {
		return affDao.findAll();
	}

	@Override
	public Aff findById(int aid) {
		return affDao.findById(aid);
	}

	@Override
	public boolean add(Aff aff) {
		aff.setAdate(new Date(System.currentTimeMillis()));
		return affDao.add(aff) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] aids) {
		return affDao.delete(aids) > 0 ? true : false;
	}

	@Override
	public boolean update(Aff aff) {
		return affDao.update(aff) > 0 ? true : false;
	}

	@Override
	public List<Aff> findByTitle(Aff aff) {
		return affDao.findByTitle(aff);
	}

}
