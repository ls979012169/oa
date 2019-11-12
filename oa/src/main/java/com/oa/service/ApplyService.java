package com.oa.service;

import java.util.List;

import com.oa.pojo.Apply;
import com.oa.vo.ApplyVO;

/**
 * @author cjg
 * @category 请假申请业务逻辑层
 */
public interface ApplyService {
	/**
	 * 查询所有请假信息
	 * 
	 * @return
	 */
	public List<ApplyVO> findAll();

	/**
	 * 根据员工编号查找请假信息
	 * 
	 * @param uid
	 *            员工
	 * @return
	 */
	public List<ApplyVO> findByUid(int uid);

	/**
	 * 根据请假申请编号查询一条请假申请对象
	 * 
	 * @param id
	 *            请假申请对象
	 * @return
	 */
	public ApplyVO findById(int id);

	/**
	 * 增加一条请假申请对象
	 * 
	 * @param apply
	 *            请假申请对象
	 * @return
	 */
	public boolean add(Apply apply);

	/**
	 * 根据请假申请编号删除一条请假申请
	 * 
	 * @param id
	 *            请假申请编号
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * 更新一条请假申请对象
	 * 
	 * @param apply
	 *            请假申请对象
	 * @return
	 */
	public boolean update(ApplyVO apply);
	/**
	 * 根据员工编号删除该员工请假申请
	 * @param eid
	 * @return
	 */
	public boolean deleteByEid(int eid);
	/**
	 * 根据状态查询
	 * @param sid
	 * @return
	 */
	public List<ApplyVO> findBySid(int sid);
}
