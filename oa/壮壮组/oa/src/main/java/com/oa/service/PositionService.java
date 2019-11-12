package com.oa.service;

import java.util.List;

import com.oa.pojo.Position;

/**
 * @author xxl
 * @category 职位表业务逻辑层接口
 */
public interface PositionService {

	/**
	 * 查询所有的职位
	 * 
	 * @return
	 */
	public List<Position> findAll();

	/**
	 * 根据职位编号查询职位
	 * 
	 * @param id
	 * @return
	 */
	public Position findById(int id);

}
