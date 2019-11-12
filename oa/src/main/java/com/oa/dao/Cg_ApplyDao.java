package com.oa.dao;

import java.util.List;

import com.oa.pojo.Cg_Apply;
import com.oa.vo.Cg_ApplyVO;

/**
 * @author song
 * @category 资产采购申请业务访问接口
 *
 */
public interface Cg_ApplyDao {

	/**
	 * @return 查询所有资产采购申请信息
	 */
	public List<Cg_Apply> findAll();

	/**
	 * @param pid
	 * @return 根据采购编号查询采购申请信息
	 */
	public Cg_Apply findById(int pid);

	/**
	 * 根据库存编号查询采购申请信息
	 * 
	 * @param iid
	 * @return
	 */
	public List<Cg_Apply> findByCg_ApplyId(int iid);

	/**
	 * @param cg_Apply
	 * @return 增加一个资产采购申请表
	 */
	public int add(Cg_Apply cg_Apply);

	/**
	 * @param iid
	 * @return 根据库存编号删除资产采购申请表
	 */
	public int delete(int iid);
	
	
	/**
	 * 根据员工id删除员工资产采购申请信息
	 * @param uid
	 * @return
	 */
	public int deleteEmp(int uid);

	/**
	 * @param cg_ApplyVO
	 * @return 更新资产采购申请信息
	 */
	public int update(Cg_Apply cg_Apply);

}
