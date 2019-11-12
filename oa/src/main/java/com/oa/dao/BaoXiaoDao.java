package com.oa.dao;

import java.util.List;

import com.oa.pojo.Baoxiao;

/**
 * @author wl
 * @category 报销数据访问层
 *
 */
public interface BaoXiaoDao {

	/**
	 * 查询所有报销列表
	 * @return
	 */
	public List<Baoxiao> find();
	/**
	 * 根据编号查询报销列表
	 * @param id
	 * @return
	 */
	public Baoxiao findByBid(int id);
	/**
	 * 根据报销科目编号查询报销列表
	 * @return
	 */
	public List<Baoxiao> findById(int bid);
	/**
	 * 根据申请人编号查询报销列表
	 * @return
	 */
	public List<Baoxiao> findlist(int uid);
	/**
	 * 根据状态编号查询报销列表
	 * @return
	 */
	public List<Baoxiao> findBySid(int sid);
	/**
	 * 申请报销
	 * @param baoxiao
	 * @return
	 */
	public int add(Baoxiao baoxiao);
	/**
	 * 更新
	 * @param baoxiao
	 * @return 返回受影响的行数
	 */
	public int update(Baoxiao baoxiao);
	/**
	 * 根据编号删除
	 * @category 数组，可同时删除多条
	 * @param baoxiao
	 * @return 返回受影响的行数
	 */
	public int delete(int [] ids);
	/**
	 * 根据申请人编号删除
	 * @param uid
	 * @return
	 */
	public int deleteByUid(int uid);
}
