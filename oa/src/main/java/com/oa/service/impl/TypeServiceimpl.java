package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.TypeDao;

import com.oa.pojo.Type;
import com.oa.service.TypeService;

/**
 * @category报销科目业务逻辑实现类
 * @author wyr
 *
 */
@Service
public class TypeServiceimpl implements TypeService {
	@Autowired
	private TypeDao typeDao;

	@Override
	public Type findByBid(int bid) {
		return typeDao.findByBid(bid);
	}

	@Override
	public List<Type> findAll() {
		return typeDao.findAll();
	}

	@Override
	public boolean add(Type type) {
		return typeDao.add(type) > 0 ? true : false;
	}

}
