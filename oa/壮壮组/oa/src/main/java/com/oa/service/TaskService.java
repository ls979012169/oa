package com.oa.service;

import java.util.List;

import com.oa.pojo.Aff;
import com.oa.pojo.Task;
import com.oa.vo.TaskVO;

/**
 * @category个人任务业务逻辑层
 * @author wyr
 *
 */
public interface TaskService {
	/**
	 * 根据员工id编号，查询个人任务
	 * 
	 * @param eid
	 * @return
	 */
	public List<TaskVO> findByEid(int eid);

	/**
	 * 根据任务id编号，查询个人任务
	 * 
	 * @param string
	 * @return
	 */
	public TaskVO findByTid(int tid);

	/**
	 * 根据任务列表查询所有
	 * 
	 * @return
	 */
	public List<TaskVO> findAll();

	/**
	 * 查询出一个部门所有员工的任务列表
	 * 
	 * @param bid
	 * @return
	 */
	public List<TaskVO> findByBid(int bid);

	/**
	 * 增加任务
	 * 
	 * @param task
	 * @return
	 */
	public boolean add(Task task);

	/**
	 * 删除任务
	 * 
	 * @param task
	 * @return
	 */
	public boolean delete(int tid);

	/**
	 * 更新任务
	 * 
	 * @param task
	 * @return
	 */
	public boolean update(Task task);

}
