package com.oa.dao;

import java.util.List;

import com.oa.pojo.Type;

/**
 * @author wyr
 * @category 报销科目数据访问层
 */
public interface TypeDao {

	/**
	 * 通过报销科目编号查询报销科目
	 * 
	 * @param bid
	 * @return
	 */
	public Type findByBid(int bid);

	/**
	 * 查询所有的报销科目
	 * 
	 * @return
	 */
	public List<Type> findAll();

	/**
	 * 添加报销科目
	 * 
	 * @param tapy
	 * @return
	 */
	public int add(Type type);
}
