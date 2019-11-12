package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.PositionDao;
import com.oa.pojo.Position;
import com.oa.service.PositionService;

/**
 * @author xxl
 * @category 职位表业务逻辑实现层
 */
@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	private PositionDao positionDao;

	@Override
	public List<Position> findAll() {
		return positionDao.findAll();
	}

	@Override
	public Position findById(int id) {
		return positionDao.findById(id);
	}

}
