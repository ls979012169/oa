package com.oa.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.Ly_applyDao;
import com.oa.dao.StateDao;
import com.oa.pojo.Ly_apply;
import com.oa.service.Gh_applyService;
import com.oa.service.Ly_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Gh_applyVO;
import com.oa.vo.Ly_applyVO;

/**
 * @author xxl
 * @category 资产领用申请表业务逻辑实现层
 */
@Service
public class Ly_applyServiceImpl implements Ly_applyService {

	@Autowired
	private Ly_applyDao ly_applyDao;

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired
	private StateDao stateDao;

	@Autowired
	private Gh_applyService gh_applyService;

	@Autowired
	private PropertyService propertyService;

	/**
	 * 把一个ly_apply转换为ly_applyVO
	 * 
	 * @param ly_apply
	 * @return
	 */
	private Ly_applyVO change(Ly_apply ly_apply) {
		Ly_applyVO ly_applyVO = new Ly_applyVO();
		ly_applyVO.setApid(ly_apply.getApid());
		ly_applyVO.setEid(ly_apply.getEid());
		ly_applyVO.setEid(ly_apply.getIid());
		ly_applyVO.setSta_id(ly_apply.getSta_id());
		ly_applyVO.setApnumber(ly_apply.getApnumber());
		ly_applyVO.setApdate(ly_apply.getApdate());
		ly_applyVO.setPdate(ly_apply.getPdate());
		ly_applyVO.setEname(employeeDao.findById(ly_apply.getEid()).getEname());
		ly_applyVO.setBid(employeeDao.findById(ly_apply.getEid()).getBid());
		ly_applyVO.setDname(departmentDao.findById(employeeDao.findById(ly_apply.getEid()).getBid()).getDname());
		ly_applyVO.setState(stateDao.findById(ly_apply.getSta_id()).getState());
		ly_applyVO.setIid(ly_apply.getIid());
		ly_applyVO.setIname(propertyService.findById(ly_apply.getIid()).getIname());
		return ly_applyVO;
	}

	/**
	 * 把一个List(Ly_apply)转化为List<Ly_applyVO>
	 * 
	 * @param ly_applies
	 * @return
	 */
	private List<Ly_applyVO> changeList(List<Ly_apply> ly_applies) {
		List<Ly_applyVO> ly_applyVOs = new ArrayList<Ly_applyVO>();
		for (Ly_apply ly_apply : ly_applies) {
			ly_applyVOs.add(change(ly_apply));
		}
		return ly_applyVOs;
	}

	@Override
	public boolean addLy_apply(Ly_apply ly_apply) {
		ly_apply.setApdate(new Date(System.currentTimeMillis()));
		ly_apply.setSta_id(1);
		return ly_applyDao.addLy_apply(ly_apply) > 0 ? true : false;
	}

	@Override
	public boolean delLy_apply(int apid) {
		// 删除该领用申请表对应的归还申请表
		Boolean flag = false;
		List<Gh_applyVO> gh_applyVOs = gh_applyService.findAll();
		for (Gh_applyVO gh_applyVO2 : gh_applyVOs) {
			if (gh_applyVO2.getApid() == apid) {
				gh_applyService.delGh_apply(gh_applyVO2.getId());
				flag = true;
			}
		}
		if (flag == true) {
			return ly_applyDao.delLy_apply(apid) > 0 ? true : false;
		} else {
			return false;
		}
	}

	@Override
	public boolean changeState(int apid, int sta_id) {
		return ly_applyDao.changeState(apid, sta_id) > 0 ? true : false;
	}

	@Override
	public List<Ly_applyVO> findAll() {
		return changeList(ly_applyDao.findAll());
	}

	@Override
	public Ly_applyVO findById(int apid) {
		return change(ly_applyDao.findById(apid));
	}

	@Override
	public List<Ly_applyVO> findByState(int sta_id) {
		return changeList(ly_applyDao.findByState(sta_id));
	}

	@Override
	public boolean update(Ly_applyVO ly_apply) {
		ly_apply.setPdate(new Date(System.currentTimeMillis()));
		return ly_applyDao.update(changeVP(ly_apply)) > 0 ? true : false;
	}

	public Ly_apply changeVP(Ly_applyVO ly_applyVO){
		Ly_apply ly_apply = new Ly_apply(ly_applyVO.getApid(), ly_applyVO.getEid(), ly_applyVO.getIid(), ly_applyVO.getSta_id(), ly_applyVO.getApnumber(), ly_applyVO.getApdate(), ly_applyVO.getPdate());
		return ly_apply;
		
	}
}
