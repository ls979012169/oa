package com.oa.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.File;

/**
 * @author Song
 * @category 文件业务逻辑层接口
 */
public interface FileService {

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	public File find1(@Param("id") int id);

	/**
	 * 根据标题查询
	 * 
	 * @param atitle
	 * @return
	 */
	public File find2(@Param("atitle") String atitle);

	/**
	 * 添加文件
	 * 
	 * @param file
	 * @return
	 */
	public boolean add(File file);

	/**
	 * 删除文件对象
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * 更新文件信息
	 * 
	 * @param file
	 * @return
	 */
	public boolean update(File file);

	/**
	 * 下载文件信息
	 * 
	 * @param file
	 * @return
	 */
	public boolean download(File file);

	/**
	 * 查询出来所有的文件集合
	 * 
	 * @return
	 */
	public List<File> findUserList();
}
