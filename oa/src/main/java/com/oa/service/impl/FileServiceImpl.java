package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.FileDao;
import com.oa.pojo.File;
import com.oa.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private FileDao fileDao;

	@Override
	public File find1(int id) {
		return fileDao.find1(id);
	}

	@Override
	public File find2(String atitle) {
		return fileDao.find2(atitle);
	}

	@Override
	public boolean add(File file) {
		return fileDao.add(file) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return fileDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(File file) {
		return fileDao.update(file) > 0 ? true : false;
	}

	@Override
	public boolean download(File file) {
		return fileDao.download(file) > 0 ? true : false;
	}

	@Override
	public List<File> findUserList() {
		return fileDao.findUserList();
	}

}
