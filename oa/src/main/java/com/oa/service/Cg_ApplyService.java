package com.oa.service;

import java.util.List;

import com.oa.pojo.Cg_Apply;
import com.oa.vo.Cg_ApplyVO;

/**
 * @author song
 * @category 资产采购申请业务逻辑接口
 *
 */
public interface Cg_ApplyService {
	/**
	 * @return 查询所有资产采购申请信息
	 */
	public List<Cg_ApplyVO> findAll();

	/**
	 * @param pid
	 * @return 根据采购编号查询采购申请信息
	 */
	public Cg_ApplyVO findById(int pid);

	/**
	 * 根据库存编号查询采购申请信息
	 * 
	 * @param iid
	 * @return
	 */
	public List<Cg_ApplyVO> findByCg_ApplyId(int iid);

	/**
	 * @param cg_Apply
	 * @return 增加一个资产采购申请表
	 */
	public boolean add(Cg_Apply cg_Apply);

	/**
	 * 根据员工id删除员工资产采购申请信息
	 * 
	 * @param uid
	 * @return
	 */
	public boolean deleteEmp(int uid);

	/**
	 * @param iid
	 * @return 根据库存编号删除资产采购申请表
	 */
	public boolean delete(int iid);

	/**
	 * @param cg_Apply
	 * @return 更新资产采购申请信息
	 */
	public boolean update(Cg_ApplyVO cg_ApplyVO);

}
