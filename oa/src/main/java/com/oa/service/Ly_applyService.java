package com.oa.service;

import java.util.List;

import com.oa.pojo.Ly_apply;
import com.oa.vo.Ly_applyVO;

/**
 * @author xxl
 * @category 资产领用申请表业务逻辑层接口
 */
public interface Ly_applyService {

	/**
	 * 添加资产领用申请表
	 * 
	 * @param ly_apply
	 * @return
	 */
	public boolean addLy_apply(Ly_apply ly_apply);

	/**
	 * 根据资产领用申请表编号删除表
	 * 
	 * @param apid
	 * @return
	 */
	public boolean delLy_apply(int apid);

	/**
	 * 更改资产领用申请表的状态
	 * 
	 * @param apid
	 * @param sta_id
	 * @return
	 */
	public boolean changeState(int apid, int sta_id);

	/**
	 * 查询所有资产领用申请表
	 * 
	 * @return
	 */
	public List<Ly_applyVO> findAll();

	/**
	 * 根据资产领用申请表编号查询表
	 * 
	 * @param apid
	 * @return
	 */
	public Ly_applyVO findById(int apid);

	/**
	 * 根据资产领用申请表状态查询表
	 * 
	 * @param sta_id
	 * @return
	 */
	public List<Ly_applyVO> findByState(int sta_id);

	/**
	 * 更新一条领用信息
	 * @param ly_apply
	 * @return
	 */
	public boolean update(Ly_applyVO ly_apply);

}
