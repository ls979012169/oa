package com.oa.service;

import java.util.List;

import com.oa.pojo.Type;

/**
 * @author wyr
 * @category报销科目业务逻辑层
 */
public interface TypeService {

	/**
	 * 通过报销科目编号查询报销科目
	 * 
	 * @param bid
	 * @return
	 */
	public Type findByBid(int bid);

	/**
	 * 查询所有报销科目
	 * 
	 * @return
	 */
	public List<Type> findAll();

	/**
	 * 添加报销科目
	 * 
	 * @param Type_app
	 * @return
	 */
	public boolean add(Type type);
}
