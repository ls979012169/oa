package com.oa.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.BaoXiaoDao;
import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.StateDao;
import com.oa.dao.TypeDao;
import com.oa.pojo.Baoxiao;
import com.oa.pojo.Department;
import com.oa.pojo.Employee;
import com.oa.pojo.State;
import com.oa.pojo.Type;
import com.oa.service.BaoxiaoService;
import com.oa.vo.BaoXiaoVO;

/**
 * @author wl
 * @category 报销业务逻辑实现类
 *
 */
@Service
public class BaoxiaoServiceImpl implements BaoxiaoService {
	@Autowired
	private BaoXiaoDao baoXiaoDao;
	@Autowired
	private TypeDao typeDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private StateDao stateDao;
	
	private List<BaoXiaoVO> list_vo=new ArrayList<BaoXiaoVO>();

	public void change(List<BaoXiaoVO> list_vo, List<Baoxiao> list){
		for (Baoxiao baoxiao : list) {
			Employee employee=employeeDao.findById(baoxiao.getUid());
			String ename=employee.getEname();
			Type type=typeDao.findByBid(baoxiao.getBid());
			String bname=type.getBname();
			String dname=departmentDao.findById(employeeDao.findById(baoxiao.getUid()).getBid()).getDname();
			State state=stateDao.findById(baoxiao.getSid());
			String s_name=state.getState();
			 BaoXiaoVO baoXiaoVO=new BaoXiaoVO(baoxiao.getId(), baoxiao.getBid(), bname, baoxiao.getUid(), ename, dname, baoxiao.getDate(), baoxiao.getMoney(), baoxiao.getSid(), s_name, baoxiao.getUse(), baoxiao.getPdate());
			 list_vo.add(baoXiaoVO);
		}
	}
	public BaoXiaoVO changepo(Baoxiao baoxiao){
		BaoXiaoVO baoXiaoVO=new BaoXiaoVO(baoxiao.getId(), baoxiao.getBid(), typeDao.findByBid(baoxiao.getBid()).getBname(), baoxiao.getUid(), employeeDao.findById( baoxiao.getUid()).getEname(), departmentDao.findById(employeeDao.findById(baoxiao.getUid()).getBid()).getDname() , baoxiao.getDate(), baoxiao.getMoney(), baoxiao.getSid(), stateDao.findById(baoxiao.getSid()).getState(), baoxiao.getUse(), baoxiao.getPdate());
		return baoXiaoVO;
	}
	public Baoxiao changevo(BaoXiaoVO baoXiaoVO){
		Baoxiao baoxiao=new Baoxiao(baoXiaoVO.getId(), baoXiaoVO.getBid(), baoXiaoVO.getUid(), baoXiaoVO.getDate(), baoXiaoVO.getMoney(), baoXiaoVO.getSid(), baoXiaoVO.getUse(), baoXiaoVO.getPdate());
	   return baoxiao;
	}
	@Override
	public List<BaoXiaoVO> find() {
		List<Baoxiao> list=baoXiaoDao.find();
		change(list_vo, list);
		return list_vo;
	}

	@Override
	public List<BaoXiaoVO> findById(int bid) {
		List<Baoxiao> list=baoXiaoDao.findById(bid);
		change(list_vo, list);
		return list_vo;
	}

	@Override
	public List<BaoXiaoVO> findlist(int uid) {
		List<Baoxiao> list=baoXiaoDao.findlist(uid);
		change(list_vo, list);
		return list_vo;
	}
	@Override
	public List<BaoXiaoVO> findBySid(int sid) {
		List<Baoxiao> list=baoXiaoDao.findBySid(sid);
		change(list_vo, list);
		return list_vo;
	}
	@Override
	public boolean add(Baoxiao baoxiao) {
		baoxiao.setDate(new Date(System.currentTimeMillis()));
		return baoXiaoDao.add(baoxiao)>0?true:false;
	}

	@Override
	public boolean update(BaoXiaoVO baoXiaoVO) {
		baoXiaoVO.setPdate(new Date(System.currentTimeMillis()));
		return baoXiaoDao.update(changevo(baoXiaoVO))>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		return baoXiaoDao.delete(ids)>0?true:false;
	}
	@Override
	public BaoXiaoVO findByBid(int id) {
 		return  changepo(baoXiaoDao.findByBid(id));
	}
	@Override
	public boolean deleteByUid(int uid) {
		return  baoXiaoDao.deleteByUid(uid)>0?true:false;
	}
}
