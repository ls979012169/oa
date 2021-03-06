package com.oa.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.Cg_ApplyDao;
import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.PropertyDao;
import com.oa.dao.StateDao;
import com.oa.pojo.Cg_Apply;
import com.oa.pojo.Department;
import com.oa.pojo.Employee;
import com.oa.pojo.Property;
import com.oa.pojo.State;
import com.oa.service.Cg_ApplyService;
import com.oa.vo.Cg_ApplyVO;

/**
 * @author song
 * @category 资产采购申请业务逻辑实现类
 *
 */
@Service
public class Cg_ApplyServiceImpl implements Cg_ApplyService {
	@Autowired
	private Cg_ApplyDao icg_applyDao;
	@Autowired
	private PropertyDao propertyDao;
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private StateDao stateDao;

	private List<Cg_ApplyVO> list_vo = new ArrayList<Cg_ApplyVO>();

	/**
	 * 将PO对象转换成VO对象
	 * 
	 * @param list_vo
	 *            VO集合
	 * @param list
	 *            PO集合
	 */
	public void info(List<Cg_ApplyVO> list_vo, List<Cg_Apply> list) {
		for (Cg_Apply cg_Apply : list) {
			Property property = propertyDao.findById(cg_Apply.getIid());
			String kname = property.getIname();
			String ktype = property.getItype();
			String kmold = property.getIclass();
			Employee employee = employeeDao.findById(cg_Apply.getUid());
			String yname = employee.getEname();
			String bname = departmentDao.findById(employee.getBid()).getDname();
			State state = stateDao.findById(cg_Apply.getSta_id());
			String state1 = state.getState();
			Cg_ApplyVO cg_ApplyVO = new Cg_ApplyVO(cg_Apply.getPid(), cg_Apply.getIid(), kname, kmold, ktype,
					cg_Apply.getUid(), yname, bname, cg_Apply.getSta_id(), state1, cg_Apply.getC_number(),
					cg_Apply.getPdate());
			list_vo.add(cg_ApplyVO);
		}
	}

	@Override
	public List<Cg_ApplyVO> findAll() {
		List<Cg_ApplyVO> listvo = new ArrayList<Cg_ApplyVO>();
		List<Cg_Apply> list = icg_applyDao.findAll();
		info(list_vo, list);
		return list_vo;
	}

	@Override
	public Cg_Apply findById(int pid) {
		return icg_applyDao.findById(pid);
	}

	@Override
	public boolean add(Cg_Apply cg_Apply) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String pdate = dateFormat.format(date);
		cg_Apply.setPdate(pdate);
		return icg_applyDao.add(cg_Apply) > 0 ? true : false;
	}

	@Override
	public boolean delete(int iid) {
		return icg_applyDao.delete(iid) > 0 ? true : false;
	}

	@Override
	public boolean update(Cg_Apply cg_Apply) {
		return icg_applyDao.update(cg_Apply) > 0 ? true : false;
	}

	@Override
	public Cg_Apply findByCg_ApplyId(int iid) {
		return icg_applyDao.findByCg_ApplyId(iid);
	}

	@Override
	public boolean deleteEmp(int uid) {
		return icg_applyDao.deleteEmp(uid) > 0 ? true : false;
	}

}
