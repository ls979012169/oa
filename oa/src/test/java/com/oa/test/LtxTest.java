package com.oa.test;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Gh_apply;
import com.oa.pojo.Ly_apply;
import com.oa.pojo.Position;
import com.oa.service.EmployeeService;
import com.oa.service.Gh_applyService;
import com.oa.service.Ly_applyService;
import com.oa.service.PositionService;
import com.oa.service.PropertyService;
import com.oa.service.StateService;

/**
 * @author xxl
 * @category 测试
 */
public class LtxTest {

	public void testGh() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		Gh_applyService gh_applyService = context.getBean(Gh_applyService.class);
		Gh_apply gh_apply = new Gh_apply(1, new Date(System.currentTimeMillis()), 1,
				new Date(System.currentTimeMillis()));
		gh_applyService.addGh_apply(gh_apply);
	}

	public void testLy() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		Ly_applyService ly_applyService = context.getBean(Ly_applyService.class);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		StateService stateService = context.getBean(StateService.class);
		Ly_apply ly_apply = new Ly_apply(1, 1, 1, 2, new Date(System.currentTimeMillis()),
				new Date(System.currentTimeMillis()));
		// ly_applyService.addLy_apply(ly_apply);
		System.out.println(ly_applyService.findById(1).getEname());
	}

	public void testPosition() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		PositionService positionService = context.getBean(PositionService.class);
		System.out.println(positionService.findById(1).getPname());
		for (Position position : positionService.findAll()) {
			System.out.println(position.getPname());
		}
	}

	public void testProperty() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		PropertyService propertyService = context.getBean(PropertyService.class);
		System.out.println(propertyService.findById(1).getIname());
	}

	public void testState() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		StateService stateService = context.getBean(StateService.class);
		System.out.println(stateService.findById(1).getState());
	}

}
