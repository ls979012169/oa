package com.oa.dao;

import java.util.List;

import com.oa.pojo.Position;

/**
 * @author xxl
 * @category 职位表数据访问层
 */
public interface PositionDao {

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
