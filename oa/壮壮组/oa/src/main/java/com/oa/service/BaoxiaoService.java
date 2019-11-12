package com.oa.service;

import java.util.List;

import com.oa.pojo.Baoxiao;
import com.oa.vo.BaoXiaoVO;

/**
 * @author wl
 * @category 报销业务逻辑层
 *
 */

public interface BaoxiaoService {
	/**
	 * 查询所有报销列表
	 * @return
	 */
	public List<BaoXiaoVO> find();
	/**
	 * 根据编号查询报销列表
	 * @param id
	 * @return
	 */
	public BaoXiaoVO findByBid(int id);
	/**
	 * 根据报销科目编号查询报销列表
	 * @return
	 */
	public List<BaoXiaoVO> findById(int bid);
	/**
	 * 根据申请人编号查询报销列表
	 * @return
	 */
	public List<BaoXiaoVO> findlist(int uid);
	/**
	 * 根据状态编号查询报销列表
	 * @return
	 */
	public List<BaoXiaoVO> findBySid(int sid);
	/**
	 * 申请报销
	 * @param baoxiao
	 * @return
	 */
	public boolean add(Baoxiao baoxiao);
	/**
	 * 更新
	 * @param baoxiao
	 * @return 返回受影响的行数
	 */
	public boolean update(BaoXiaoVO baoXiaoVO);
	/**
	 * 根据编号删除
	 * @category 数组，可同时删除多条
	 * @param baoxiao
	 * @return 返回受影响的行数
	 */
	public boolean delete(int [] ids);
	/**
	 * 根据申请人编号删除
	 * @param uid
	 * @return
	 */
	public boolean  deleteByUid(int uid);
}
