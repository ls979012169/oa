package com.oa.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.ApplyDao;
import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.StateDao;
import com.oa.pojo.Apply;
import com.oa.pojo.Employee;
import com.oa.pojo.State;
import com.oa.service.ApplyService;
import com.oa.vo.ApplyVO;

/**
 * @author cjg
 * @category 请假申请业务逻辑实现类
 */
@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyDao applyDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private StateDao stateDao;
	@Autowired
	private DepartmentDao departmentDao;
	private List<ApplyVO> list_vo = new ArrayList<ApplyVO>();

	/**
	 * 将PO对象转换成VO对象
	 * 
	 * @param list_vo
	 *            VO集合
	 * @param list
	 *            PO集合
	 */
	public void change(List<ApplyVO> list_vo, List<Apply> list) {
		for (Apply apply : list) {
			Employee employee = employeeDao.findById(apply.getUid());
			String sname = employee.getEname();
			String dept = departmentDao.findById(employee.getBid()).getDname();
			State state = stateDao.findById(apply.getSid());
			String state1 = state.getState();
			ApplyVO applyVO = new ApplyVO(apply.getId(), apply.getUid(), sname, dept, apply.getReason(),
					apply.getType(), apply.getS_date(), apply.getQ_date(), apply.getZ_date(), apply.getPdate(),
					apply.getSid(), state1);
			list_vo.add(applyVO);
		}
	}

	/**
	 * PO对象转换成VO对象
	 * 
	 * @param apply
	 *            PO对象
	 * @return
	 */
	public ApplyVO changePV(Apply apply) {
		ApplyVO applyVO = new ApplyVO(apply.getId(), apply.getUid(), employeeDao.findById(apply.getUid()).getEname(),
				departmentDao.findById(employeeDao.findById(apply.getUid()).getBid()).getDname(), apply.getReason(),

				apply.getType(), apply.getS_date(), apply.getQ_date(), apply.getZ_date(), apply.getPdate(),
				apply.getSid(), stateDao.findById(apply.getSid()).getState());
		return applyVO;

	}

	/**
	 * VO对象转换成PO对象
	 * 
	 * @param applyVO
	 *            VO对象
	 * @return
	 */
	public Apply changeVP(ApplyVO applyVO) {
		Apply apply = new Apply(applyVO.getId(), applyVO.getUid(), applyVO.getReason(), applyVO.getType(),
				applyVO.getS_date(), applyVO.getQ_date(), applyVO.getZ_date(), applyVO.getPdate(), applyVO.getSid());
		return apply;

	}

	@Override
	public List<ApplyVO> findAll() {
		List<Apply> list = applyDao.findAll();
		change(list_vo, list);
		return list_vo;
	}

	@Override
	public List<ApplyVO> findByUid(int uid) {
		List<Apply> list = applyDao.findByUid(uid);
		change(list_vo, list);
		return list_vo;
	}

	@Override
	public ApplyVO findById(int id) {
		return changePV(applyDao.findById(id));
	}

	@Override
	public boolean add(Apply apply) {
		apply.setS_date(new Date(System.currentTimeMillis()));
		apply.setSid(1);
		return applyDao.add(apply) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return applyDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(ApplyVO apply) {
		apply.setPdate(new Date(System.currentTimeMillis()));
		return applyDao.update(changeVP(apply)) > 0 ? true : false;
	}

	@Override
	public boolean deleteByEid(int eid) {
		return applyDao.deleteByEid(eid) > 0 ? true : false;
	}

	@Override
	public List<ApplyVO> findBySid(int sid) {
		change(list_vo, applyDao.findBySid(sid));
		return list_vo;
	}

}
