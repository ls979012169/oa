package com.oa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Gh_apply;
import com.oa.pojo.Ly_apply;
import com.oa.pojo.Property;
import com.oa.service.Gh_applyService;
import com.oa.service.Ly_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Gh_applyVO;
import com.oa.vo.Ly_applyVO;

public class Test3 {

	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		Gh_applyService gh_applyService = applicationContext.getBean(Gh_applyService.class);
		Ly_applyService ly_applyService = applicationContext.getBean(Ly_applyService.class);
		PropertyService propertyService = applicationContext.getBean(PropertyService.class);

		Gh_applyVO gh_apply = gh_applyService.findById(1);
//		gh_apply.setSid(2);
//		System.out.println(gh_applyService.update(gh_apply));
		//Gh_applyVO gh_applyVO = new Gh_applyVO();
		//Gh_applyVO gh_applyVO = gh_applyService.findById(1);
		Ly_applyVO ly_apply = ly_applyService.findById(gh_apply.getApid());
		int iid = ly_apply.getIid();
		int c = 2;
		gh_apply.setSid(c);
		gh_applyService.update(gh_apply);
		int a = ly_apply.getApnumber();
		if(c==2){
			Property property = propertyService.findById(iid);
			int b = property.getInumber();
			property.setInumber(a+b);
			System.out.println(propertyService.update(property));
		}else{
			System.out.println("不能还");
		}
		
		
		
		
		
		

	}
}
