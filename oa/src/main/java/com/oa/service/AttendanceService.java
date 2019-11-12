package com.oa.service;

import java.util.List;

import com.oa.pojo.Attendance;
import com.oa.vo.AttendanceVO;

/**
 * @author wl
 * @category 打卡业务逻辑层
 *
 */
public interface AttendanceService {
	/**
	 * 查询所有打卡列表
	 * 
	 * @return
	 */
	public List<AttendanceVO> findAll();

	/**
	 * 根据员工编号，查询打卡列表
	 * 
	 * @param eid
	 * @return
	 */
	public List<AttendanceVO> findlist(int eid);

	/**
	 * 增加一条打卡
	 * 
	 * @param attendance
	 * @return
	 */
	public boolean add(Attendance attendance);

	/**
	 * 更新
	 * 
	 * @param attendance
	 * @return
	 */
	public boolean update(Attendance attendance);

	/**
	 * 根据打卡编号删除
	 * 
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
}
