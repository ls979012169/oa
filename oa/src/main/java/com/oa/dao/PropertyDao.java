package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Property;

/**
 * @author xxl
 * @category 库存合账数据访问层接口
 */
public interface PropertyDao {

	/**
	 * 根据iname（库存名称）查询对应库存数据
	 * 
	 * @param iname
	 * @return
	 */
	public Property findByName(String iname);

	/**
	 * 根据iid(库存编号)查询对应库存数据
	 * 
	 * @param iid
	 * @return
	 */
	public Property findById(int iid);

	/**
	 * 查询全部库存
	 * 
	 * @return
	 */
	public List<Property> findAll();

	/**
	 * 通过iid删除库存
	 * 
	 * @param iid
	 * @return
	 */
	public int delProperty(int iid);

	/**
	 * 添加库存信息(新的库存)
	 */
	public int addProperty(Property property);

	/**
	 * 根据已有的iid更改剩余数量
	 * 
	 * @param iid
	 * @param inumber
	 *            新的库存数量
	 * @return
	 */
	public int updateNumber(@Param("iid") int iid, @Param("inumber") int inumber);

	
	/**
	 * 更新库存报废数量
	 * @param property
	 * @return
	 */
	public int update(Property property);
	
}
