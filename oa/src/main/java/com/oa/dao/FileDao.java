package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.File;

/**
 * @author Song
 * @category 文件数据访问层
 */
public interface FileDao {

	/**
	 * 根据ID查询
	 */
	public File find1(@Param("id")int id); 
	/**
	 * 根据标题查询
	 */
	public File find2(@Param("atitle")String atitle); 
	/**
	 * 添加文件
	 */
	public int add(File file);
	/**
	 * 删除文件对象
	 */
	public int delete(int id);
	/**
	 * 更新文件信息
	 */
	public int update(File file);
	/**
	 * 下载文件信息
	 */
	public int download(File file);
	/**
	 * 查询出来所有的文件集合
	 */
	public List<File> findUserList();
}
