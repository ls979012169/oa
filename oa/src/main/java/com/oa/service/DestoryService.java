package com.oa.service;

import java.util.List;

import com.oa.pojo.Destory;
import com.oa.vo.DestoryVO;

/**
 * @author Administrator
 * @category 资产报废业务逻辑层
 */
public interface DestoryService {
	
	/**
	 * 查询所有资产报废信息
	 * @return
	 */
	public List<DestoryVO> findAll();
	/**
	 * 根据资产报废id查询一条资产报废信息
	 * @param id  资产编号
	 * @return
	 */
	public DestoryVO select(int id);
	/**
	 * 增加一条资产报废信息
	 * @param destory
	 * @return
	 */
	public boolean insert(Destory destory);
	/**
	 * 根据资产报销id删除一条资产报废信息
	 * @param pid  资产编号
	 * @return
	 */
	public boolean delete(int pid);
	/**
	 * 更新一条资产报废信息
	 * @param destory
	 * @return
	 */
	public boolean update(Destory destory);
	


}
