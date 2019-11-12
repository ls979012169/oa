package com.oa.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.Gh_applyDao;
import com.oa.dao.Ly_applyDao;
import com.oa.dao.StateDao;
import com.oa.pojo.Gh_apply;
import com.oa.service.Gh_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Gh_applyVO;

/**
 * @author xxl
 * @category 资产领用申请表业务逻辑实现层
 */
@Service
public class Gh_applyServiceImpl implements Gh_applyService {

	@Autowired
	private Gh_applyDao gh_applyDao;

	@Autowired
	private Ly_applyDao ly_applyDao;

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired
	private StateDao stateDao;

	@Autowired
	private PropertyService propertyService;

	/**
	 * 把一个gh_apply转换为gh_applyVO
	 * 
	 * @param gh_apply
	 * @return
	 */
	private Gh_applyVO change(Gh_apply gh_apply) {
		Gh_applyVO gh_applyVO = new Gh_applyVO();
		gh_applyVO.setId(gh_apply.getId());
		gh_applyVO.setApid(gh_apply.getApid());
		gh_applyVO.setEid(ly_applyDao.findById(gh_apply.getApid()).getEid());
		gh_applyVO.setEname(employeeDao.findById(ly_applyDao.findById(gh_apply.getApid()).getEid()).getEname());
		gh_applyVO.setBid(employeeDao.findById(ly_applyDao.findById(gh_apply.getApid()).getEid()).getBid());
		gh_applyVO.setDname(departmentDao
				.findById(employeeDao.findById(ly_applyDao.findById(gh_apply.getApid()).getEid()).getBid()).getDname());
		gh_applyVO.setGhdatetime(gh_apply.getGhdatetime());
		gh_applyVO.setSid(gh_apply.getSid());
		gh_applyVO.setState(stateDao.findById(gh_apply.getSid()).getState());
		gh_applyVO.setPdate(gh_apply.getPdate());
		gh_applyVO.setIid(ly_applyDao.findById(gh_apply.getApid()).getIid());
		gh_applyVO.setIname(propertyService.findById(ly_applyDao.findById(gh_apply.getApid()).getIid()).getIname());
		return gh_applyVO;
	}

	/**
	 * 把一个List(Gh_apply)转化为List<Gh_applyVO>
	 * 
	 * @param gh_applies
	 * @return
	 */
	private List<Gh_applyVO> changeList(List<Gh_apply> gh_applies) {
		List<Gh_applyVO> gh_applyVOs = new ArrayList<Gh_applyVO>();
		for (Gh_apply gh_apply : gh_applies) {
			gh_applyVOs.add(change(gh_apply));
		}
		return gh_applyVOs;
	}

	@Override
	public boolean addGh_apply(Gh_apply gh_apply) {
		gh_apply.setGhdatetime(new Date(System.currentTimeMillis()));
		gh_apply.setSid(1);
		return gh_applyDao.addGh_apply(gh_apply) > 0 ? true : false;
	}

	@Override
	public boolean delGh_apply(int id) {
		return gh_applyDao.delGh_apply(id) > 0 ? true : false;
	}

	@Override
	public boolean changeState(int id, int sid) {
		return gh_applyDao.changeState(id, sid) > 0 ? true : false;
	}

	@Override
	public List<Gh_applyVO> findAll() {
		return changeList(gh_applyDao.findAll());
	}

	@Override
	public Gh_applyVO findById(int id) {
		return change(gh_applyDao.findById(id));
	}

	@Override
	public List<Gh_applyVO> findByState(int sid) {
		return changeList(gh_applyDao.findByState(sid));
	}

	@Override
	public boolean update(Gh_applyVO gh_apply) {
		gh_apply.setPdate(new Date(System.currentTimeMillis()));
		return gh_applyDao.update(changeVP(gh_apply)) > 0 ? true : false;
	}

	public Gh_apply changeVP(Gh_applyVO gh_applyVO) {
		Gh_apply gh_apply = new Gh_apply(gh_applyVO.getId(), gh_applyVO.getApid(), gh_applyVO.getGhdatetime(),
				gh_applyVO.getSid(), gh_applyVO.getPdate());
		return gh_apply;
	}

}
