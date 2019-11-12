package com.oa.dao;


import java.util.List;

import com.oa.pojo.Destory;

/**
 * @author Administrator
 * @category 资产报废数据库访问层
 */
public interface DestoryDao {
	
	/**
	 * 查询所有资产报废信息
	 * @return
	 */
	public List<Destory> findAll();
	/**
	 * 增加一条资产报废信息
	 * @param destory
	 * @return
	 */
	public int insert(Destory destory);
	/**
	 * 根据资产报销id删除一条资产报废信息
	 * @param id  资产编号
	 * @return
	 */
	public int delete(int id);
	/**
	 * 更新一条资产报废信息
	 * @param destory
	 * @return
	 */
	public int update(Destory destory);
	/**
	 * 根据资产报销id查询一条资产报废信息
	 * @param id  资产编号
	 * @return
	 */
	public Destory select(int id);

}
