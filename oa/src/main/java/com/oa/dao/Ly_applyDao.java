package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Ly_apply;

/**
 * @author xxl
 * @category 资产领用申请表数据访问层
 */
public interface Ly_applyDao {

	/**
	 * 添加资产领用申请表
	 * 
	 * @param ly_apply
	 * @return
	 */
	public int addLy_apply(Ly_apply ly_apply);

	/**
	 * 根据资产领用申请表编号删除表
	 * 
	 * @param apid
	 * @return
	 */
	public int delLy_apply(int apid);

	/**
	 * 更改资产领用申请表的状态
	 * 
	 * @param apid
	 * @param sta_id
	 * @return
	 */
	public int changeState(@Param("apid") int apid, @Param("sta_id") int sta_id);

	/**
	 * 查询所有资产领用申请表
	 * 
	 * @return
	 */
	public List<Ly_apply> findAll();

	/**
	 * 根据资产领用申请表编号查询表
	 * 
	 * @param apid
	 * @return
	 */
	public Ly_apply findById(int apid);

	/**
	 * 根据资产领用申请表状态查询表
	 * 
	 * @param sta_id
	 * @return
	 */
	public List<Ly_apply> findByState(int sta_id);

	/**
	 * 更新一条领用信息
	 * @param ly_apply
	 * @return
	 */
	public int update(Ly_apply ly_apply);
}
