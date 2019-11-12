package com.oa.dao;

import java.util.List;

import com.oa.pojo.Attendance;

/**
 * @author wl
 * @category 打卡数据访问层
 *
 */
public interface AttendanceDao {

	/**
	 * 查询所有考勤列表
	 * @return
	 */
	public List<Attendance>  findAll();
	/**
	 * 根据员工编号，查询考勤列表
	 * @param eid
	 * @return
	 */
	public List<Attendance>  findlist(int eid);
	/**
	 * 增加一条考勤
	 * @param attendance
	 * @return
	 */
	public int add(Attendance attendance );
	/**
	 * 更新
	 * @param attendance
	 * @return
	 */
	public int update(Attendance attendance);
	/**
	 * 根据考勤编号删除
	 * @param ids
	 * @return
	 */
	public int delete(int [] ids);
}
