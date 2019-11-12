package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Gh_apply;

/**
 * @author xxl
 * @category 资产归还申请表的数据访问层
 */
public interface Gh_applyDao {

	/**
	 * 添加资产归还申请表
	 * 
	 * @param gh_apply
	 * @return
	 */
	public int addGh_apply(Gh_apply gh_apply);

	/**
	 * 根据编号删除资产归还申请表
	 * 
	 * @param id
	 * @return
	 */
	public int delGh_apply(int id);

	/**
	 * 更改资产归还申请表的状态
	 * 
	 * @param id
	 * @param sid
	 * @return
	 */
	public int changeState(@Param("id") int id, @Param("sid") int sid);

	/**
	 * 查询所有资产归还申请表
	 * 
	 * @return
	 */
	public List<Gh_apply> findAll();

	/**
	 * 根据资产归还申请表编号查询表
	 * 
	 * @param id
	 * @return
	 */
	public Gh_apply findById(int id);

	/**
	 * 根据资产归还申请表状态查询表
	 * 
	 * @param sid
	 * @return
	 */
	public List<Gh_apply> findByState(int sid);
	/**
	 * 更新一条归还信息
	 * @param gh_apply
	 * @return
	 */
	public int update(Gh_apply gh_apply);

}
