package com.oa.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Daily;
import com.oa.vo.DailyVO;

/**
 * @author song
 * @category 个人日报业务逻辑接口
 *
 */
public interface DailyService {
	/**
	 * 增加一个日报信息
	 * 
	 * @param daily
	 * @return
	 */
	public boolean add(Daily daily);

	/**
	 * 根据部门id查询所有日报信息
	 * 
	 * @param id
	 * @return
	 */
	public List<DailyVO> findByDepId(int id);

	/**
	 * 根据日期查询当日所有日报信息
	 * 
	 * @param date
	 * @return
	 */
	public List<DailyVO> findByListDate(String date);

	/**
	 * 根据日期查询自己的日报信息
	 * 
	 * @param date
	 * @return
	 */
	public List<DailyVO> findDateOne(@Param(value = "wdate") String wdate, @Param(value = "eid") int eid);

	/**
	 * 根据员工id查询日报信息
	 * 
	 * @param eid
	 * @return
	 */
	public List<DailyVO> findById(int eid);

	/**
	 * 根据日报id查询日报信息
	 * 
	 * @param did
	 * @return
	 */
	public DailyVO findByDailyId(int did);

	/**
	 * 根据日志编号删除一条日志
	 * 
	 * @param did
	 * @return
	 */
	public boolean deleteById(int did);

	/**
	 * @param eid
	 * @return 根据员工id删除日报信息
	 */
	public boolean delete(int eid);

	/**
	 * @param daily
	 * @return 更新日报信息
	 */
	public boolean update(DailyVO dailyVO);

	/**
	 * @param eid
	 * @return 根据员工id查询日报信息
	 */
	public List<DailyVO> findAll();
}
