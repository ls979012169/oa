package com.oa.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Baoxiao;
import com.oa.pojo.Daily;
import com.oa.service.AffService;
import com.oa.service.BaoxiaoService;
import com.oa.service.DepartmentService;
import com.oa.service.DailyService;
import com.oa.service.StateService;
import com.oa.vo.BaoXiaoVO;

/**
 * @author song
 * @category 测试项目搭建类
 *
 */
public class Test2 {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		/*
		 * AttendanceService
		 * attendanceService=applicationContext.getBean(AttendanceService.class)
		 * ; System.out.println("考勤"+attendanceService);
		 */
		 
		  BaoxiaoService baoxiaoService=applicationContext.getBean(BaoxiaoService.class);
		   List<BaoXiaoVO> list=baoxiaoService.findBySid(1); 
		    for (BaoXiaoVO baoXiaoVO : list) {
				System.out.println(baoXiaoVO.getId());
			}
		 

		/*
		 * AffService affService=applicationContext.getBean(AffService.class);
		 * int [] aids={1 , 2}; System.out.println("通知公告"+affService.findAll());
		 */

		/*
		 * DepartmentService
		 * departmentService=applicationContext.getBean(DepartmentService.class)
		 * ; System.out.println("部门"+departmentService);
		 */

		// DailyService dailyService =
		// applicationContext.getBean(DailyService.class);
		// List<Daily> list = dailyService.findAll();
		// System.out.println("工作日报"+list);
//		DailyService dailyService = applicationContext.getBean(DailyService.class);
//		Daily daily = dailyService.findById2(6);
//		daily.setWdef("星期三");
//		System.out.println(dailyService.update(daily));
		
		

	}
}
