package com.oa.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Daily;

/**
 * @author song
 * @category 个人日报业务访问接口
 */
public interface DailyDao {
	/**
	 * 增加一个日报信息
	 * 
	 * @param daily
	 * @return
	 */
	public int add(Daily daily);

	/**
	 * 根据部门id查询所有日报信息
	 * 
	 * @param id
	 * @return
	 */
	public List<Daily> findByDepId(int id);

	/**
	 * 根据日期查询当日所有日报信息
	 * 
	 * @param date
	 * @return
	 */
	public List<Daily> findByListDate(String date);

	/**
	 * 根据日期和员工id查询自己的日报信息
	 * 
	 * @param date
	 * @return
	 */
	public List<Daily> findDateOne(@Param(value = "wdate") String wdate, @Param(value = "eid") int eid);

	/**
	 * 根据员工eid查询日报信息
	 * 
	 * @param eid
	 * @return
	 */
	public List<Daily> findById(int eid);

	/**
	 * 根据日报did查询日报信息
	 * 
	 * @param did
	 * @return
	 */
	public Daily findByDailyId(int did);
	
	/**
	 * 根据日志编号删除一条日志
	 * @param did
	 * @return
	 */
	public int deleteById(int did);

	/**
	 * 根据员工eid删除日报信息
	 * 
	 * @param eid
	 * @return
	 */
	public int delete(int eid);

	/**
	 * 更新日报信息
	 * 
	 * @param daily
	 * @return
	 */
	public int update(Daily daily);

	/**
	 * 查询所有个人日报
	 * 
	 * @return
	 */
	public List<Daily> findAll();
}
