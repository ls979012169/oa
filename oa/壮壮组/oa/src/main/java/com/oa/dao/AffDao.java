package com.oa.dao;

import java.util.List;

import com.oa.pojo.Aff;

/**
 * @author cjg
 * @category 通知公告数据库访问层
 */
public interface AffDao {
	/**
	 * 查询所有通知公告
	 * 
	 * @return
	 */
	public List<Aff> findAll();

	/**
	 * 根据公告编号查询一个公告信息对象
	 * 
	 * @param aid
	 *            公告编号
	 * @return
	 */
	public Aff findById(int aid);

	/**
	 * 增加一条公告信息对象
	 * 
	 * @param aff
	 *            公告信息对象
	 * @return
	 */
	public int add(Aff aff);

	/**
	 * 删除一组公告信息
	 * 
	 * @param aids  公告编号
	 * @return
	 */
	public int delete(int[] aids);

	/**
	 * 更新一条公告信息对象
	 * 
	 * @param aff
	 *            公告信息对象
	 * @return
	 */
	public int update(Aff aff);
	
	/**
	 * 模糊查询
	 * @param aff
	 * @return
	 */
	public List<Aff> findByTitle(Aff aff);

}
