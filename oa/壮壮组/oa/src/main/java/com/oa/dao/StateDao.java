package com.oa.dao;

import java.util.List;

import com.oa.pojo.State;

/**
 * @author xxl
 * @category 审核状态表数据访问层接口
 */
public interface StateDao {

	/**
	 * 查询所有状态
	 * 
	 * @return
	 */
	public List<State> findAll();

	/**
	 * 根据id查询状态
	 * 
	 * @param id
	 * @return
	 */
	public State findById(int id);
}
