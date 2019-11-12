package com.oa.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.PropertyDao;
import com.oa.pojo.Property;
import com.oa.service.PropertyService;

/**
 * @author xxl
 * @category 库存合账业务逻辑实现层
 */
@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyDao propertyDao;

	@Override
	public Property findByName(String iname) {
		return propertyDao.findByName(iname);
	}

	@Override
	public Property findById(int iid) {
		return propertyDao.findById(iid);
	}

	@Override
	public List<Property> findAll() {
		return propertyDao.findAll();
	}

	@Override
	public boolean delProperty(int iid) {
		return propertyDao.delProperty(iid) > 0 ? true : false;
	}

	@Override
	public boolean addProperty(Property property) {
		return propertyDao.addProperty(property) > 0 ? true : false;
	}

	@Override
	public boolean updateNumber(int iid, int inumber) {
		return propertyDao.updateNumber(iid, inumber) > 0 ? true : false;
	}

	@Override
	public boolean update(Property property){
		return propertyDao.update(property) > 0 ? true : false;
		
	}
	
}



