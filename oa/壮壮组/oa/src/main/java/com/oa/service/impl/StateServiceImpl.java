package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.StateDao;
import com.oa.pojo.State;
import com.oa.service.StateService;

/**
 * @author xxl
 * @category 审核状态表业务逻辑实现层
 */
@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDao stateDao;

	@Override
	public List<State> findAll() {
		return stateDao.findAll();
	}

	@Override
	public State findById(int id) {
		return stateDao.findById(id);
	}

}
