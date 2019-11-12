package com.oa.dao;

import java.util.List;

import com.oa.pojo.Task;

/**
 * @author wyr
 * @category个人任务数据访问层
 */
public interface TaskDao {

	/**
	 * 根据员工id编号，查询个人任务
	 * 
	 * @param eid
	 * @return
	 */
	public List<Task> findByEid(int eid);

	/**
	 * 根据任务id编号，查询个人任务
	 * 
	 * @param tid
	 * @return
	 */
	public Task findByTid(int tid);

	/**
	 * 根据任务列表查询所有
	 * 
	 * @return
	 */
	public List<Task> findAll();

	/**
	 * 添加任务
	 * 
	 * @return
	 */
	public boolean add(Task task);

	/**
	 * 删除任务
	 * 
	 * @return
	 */
	public boolean delete(int tid);

	/**
	 * 修改任务
	 * 
	 * @return
	 */
	public boolean update(Task task);

}
