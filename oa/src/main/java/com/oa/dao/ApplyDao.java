package com.oa.dao;

import java.util.List;

import com.oa.pojo.Apply;

/**
 * @author cjg
 * @category 请假数据访问层
 */
public interface ApplyDao {
	/**
	 * 查询所有请假信息
	 * @return
	 */
	public List<Apply> findAll();
	
	/**
	 * 根据员工编号查找请假信息
	 * @param uid 员工
	 * @return
	 */
	public List<Apply> findByUid(int uid);
	
	/**
	 * 根据请假申请编号查询一条请假申请对象
	 * @param id 请假申请对象
	 * @return
	 */
	public Apply findById(int id);
	
	/**
	 * 增加一条请假申请对象
	 * @param apply 请假申请对象
	 * @return
	 */
	public int add(Apply apply);
	
	/**
	 * 根据请假申请编号删除一条请假申请
	 * @param id 请假申请编号
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * 更新一条请假申请对象
	 * @param apply 请假申请对象
	 * @return
	 */
	public int update(Apply apply);
	
	/**
	 * 根据员工编号删除该员工请假申请
	 * @param eid
	 * @return
	 */
	public int deleteByEid(int eid);
	
	/**
	 * 根据状态查询
	 * @param sid
	 * @return
	 */
	public List<Apply> findBySid(int sid);
}
