package com.oa.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Apply;
import com.oa.pojo.Baoxiao;
import com.oa.pojo.Cg_Apply;
import com.oa.pojo.Daily;
import com.oa.pojo.Destory;
import com.oa.pojo.Property;
import com.oa.service.AffService;
import com.oa.service.ApplyService;
import com.oa.service.BaoxiaoService;
import com.oa.service.Cg_ApplyService;
import com.oa.service.DepartmentService;
import com.oa.service.DestoryService;
import com.oa.service.PropertyService;
import com.oa.service.DailyService;
import com.oa.service.StateService;
import com.oa.vo.ApplyVO;


/**
 * @author wl
 * @category 测试项目搭建类
 *
 */
public class Test1 {
	@Test
	public void test(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/spring.xml");
		//Cg_ApplyService service= applicationContext.getBean(Cg_ApplyService.class);
//		List list = service.findAll();
//		System.out.println(list.size());
//		Cg_Apply cg_Apply = new Cg_Apply(2, 3, 1, 1, 1, 1,new Date(System.currentTimeMillis()) );
//		System.out.println(service.add(cg_Apply));
//		System.out.println(service.findById(1).getPdate());
//		System.out.println(service.findById2(1).getPdate());
//		System.out.println(service.delete(1));
		/*Cg_Apply cg_Apply =service.findById(3);
		cg_Apply.setSta_id(2);
		System.out.println(service.update(cg_Apply));*/
		 
		DestoryService destoryService = applicationContext.getBean(DestoryService.class);
		PropertyService propertyService = applicationContext.getBean(PropertyService.class);
		Destory destory = new Destory();
		int c = 3;
		destory.setIid(c);
		int b = 1;
		destory.setPcount(b);
		destory.setPreason("阿斯顿发送到");
		destoryService.insert(destory);
		//System.out.println(destoryService.insert(destory));
		int a = propertyService.findById(3).getInumber();
		if(a>=b){
			
			Property property = propertyService.findById(c);
			//propertyService.update(property);
			property.setInumber(a-b);
			System.out.println(propertyService.update(property));
		}else{
			System.out.println("库存不够");
		}
	}
}
