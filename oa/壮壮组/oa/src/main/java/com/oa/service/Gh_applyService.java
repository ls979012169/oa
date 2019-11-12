package com.oa.service;

import java.util.List;

import com.oa.pojo.Gh_apply;
import com.oa.vo.Gh_applyVO;

/**
 * @author xxl
 * @category 资产领用申请表业务逻辑层接口
 */
public interface Gh_applyService {

	/**
	 * 添加资产归还申请表
	 * 
	 * @param gh_apply
	 * @return
	 */
	public boolean addGh_apply(Gh_apply gh_apply);

	/**
	 * 根据编号删除资产归还申请表
	 * 
	 * @param id
	 * @return
	 */
	public boolean delGh_apply(int id);

	/**
	 * 更改资产归还申请表的状态
	 * 
	 * @param id
	 * @param sid
	 * @return
	 */
	public boolean changeState(int id, int sid);

	/**
	 * 查询所有资产归还申请表
	 * 
	 * @return
	 */
	public List<Gh_applyVO> findAll();

	/**
	 * 根据资产归还申请表编号查询表
	 * 
	 * @param id
	 * @return
	 */
	public Gh_applyVO findById(int id);

	/**
	 * 根据资产归还申请表状态查询表
	 * 
	 * @param sid
	 * @return
	 */
	public List<Gh_applyVO> findByState(int sid);

}















