package com.oa.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DailyDao;
import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.pojo.Daily;
import com.oa.pojo.Employee;
import com.oa.service.DailyService;
import com.oa.vo.DailyVO;

/**
 * @author song
 * @category 个人日报业务逻辑实现类
 *
 */
@Service
public class DailyServiceImpl implements DailyService {
	@Autowired
	private DailyDao idailyDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;
	private List<DailyVO> list_vo = new ArrayList<DailyVO>();

	/**
	 * 把一个Daily转化为DailyVO
	 * 
	 * @param list_vo
	 * @param list
	 */
	public List<DailyVO> infoDaily(List<DailyVO> list_vo, List<Daily> list) {
		for (Daily daily : list) {

			Employee employee = employeeDao.findById(daily.getEid());
			String ename = employee.getEname();
			String bname = departmentDao.findById(employee.getBid()).getDname();
			DailyVO dailyVO = new DailyVO(daily.getDid(), daily.getEid(), ename, bname, daily.getWdef(),
					daily.getWdate());
			list_vo.add(dailyVO);
		}
		return list_vo;
	}

	@Override
	public boolean add(Daily daily) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String wdate = dateFormat.format(date);
		daily.setWdate(wdate);
		return idailyDao.add(daily) > 0 ? true : false;
	}

	@Override
	public boolean delete(int eid) {
		return idailyDao.delete(eid) > 0 ? true : false;
	}

	public boolean update(Daily daily) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String wdate = dateFormat.format(date);
		daily.setWdate(wdate);
		return idailyDao.update(daily) > 0 ? true : false;
	}

	@Override
	public List<DailyVO> findAll() {
		infoDaily(list_vo, idailyDao.findAll());
		return list_vo;
	}

	@Override
	public List<DailyVO> findById(int eid) {
		infoDaily(list_vo, idailyDao.findAll());
		return list_vo;
	}

	@Override
	public Daily findByDailyId(int did) {
		return idailyDao.findByDailyId(did);
	}

	@Override
	public List<DailyVO> findByDepId(int id) {
		infoDaily(list_vo, idailyDao.findByDepId(id));
		return list_vo;
	}

	@Override
	public List<DailyVO> findByListDate(String date) {
		infoDaily(list_vo, idailyDao.findByListDate(date));
		return list_vo;
	}

	@Override
	public List<DailyVO> findDateOne(String wdate, int eid) {
		infoDaily(list_vo, idailyDao.findDateOne(wdate, eid));
		return list_vo;
	}

}
