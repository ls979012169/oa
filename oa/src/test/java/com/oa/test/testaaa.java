package com.oa.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Attendance;
import com.oa.pojo.Daily;
import com.oa.service.ApplyService;
import com.oa.service.AttendanceService;
import com.oa.service.DailyService;
import com.oa.service.TaskService;

public class testaaa {
	ApplicationContext application = new ClassPathXmlApplicationContext("spring/spring.xml");

	@Test
	public void test() {
		
		/*TaskService service=application.getBean(TaskService.class);
		System.out.println(service.findByBid(3).size());*/
		// ApplyService applyService = application.getBean(ApplyService.class);
		// System.out.println(applyService.findBySid(1).size());
		/*AttendanceService attendanceService = application.getBean(AttendanceService.class);
		Attendance attendance = new Attendance();
		attendance.setEid(5);
		boolean flag = attendanceService.add(attendance);
		if(flag){
			System.out.println("打卡成功！");
		}*/
		// BaoxiaoService
		// baoxiaoService=application.getBean(BaoxiaoService.class);
		/*
		 * AffService affService=application.getBean(AffService.class); Aff
		 * aff=new Aff(); aff.setTitle("中");
		 */
		// System.out.println(affService.findByTitle(aff).size());
		/*
		 * List<Aff> affs=affService.findByTitle(aff); for (Aff aff2 : affs) {
		 * System.out.println(aff2.getTitle()); }
		 */
		/*
		 * Apply apply = new Apply(); apply.setDid(1); apply.setSid(1);
		 * apply.setUid(1); apply.setReason("头疼"); apply.setType("病假");
		 * apply.setQ_date(new Date(System.currentTimeMillis()));// 起始时间
		 * apply.setZ_date(new Date(System.currentTimeMillis()));// 终止时间
		 * System.out.println(applyService.add(apply));
		 */

		/*
		 * ApplyVO apply2=applyService.findById(9);
		 * System.out.println(apply2.getSname()); apply2.setPdate(new
		 * Date(System.currentTimeMillis()));
		 * 
		 * /*apply2.setSid(2); System.out.println(applyService.update(apply2));
		 * System.out.println(applyService.deleteByEid(5)); apply2.setSid(3);
		 * System.out.println(applyService.update(apply2));
		 */

		/*
		 * List<ApplyVO> apply3=applyService.findByUid(1);
		 * System.out.println(apply3.size());
		 */
		// BaoXiaoVO baoXiao=baoxiaoService.findByBid(2);
		// System.out.println(baoXiao.getSid());
		// baoXiao.setSid(3);
		// System.out.println(baoxiaoService.update(baoXiao));

		DailyService service =application.getBean(DailyService.class);
		// System.out.println(service.findByListDate("2019-11-05").size());
		// Cg_ApplyService service=application.getBean(Cg_ApplyService.class);
		// System.out.println(service.findAll().size());
		/*
		 * Daily daily=new Daily(); daily.setEid(5); daily.setWdef("girl");
		 * System.out.println(service.add(daily));
		 */
	    /* Daily daily=service.findByDailyId(9);
		 Date date = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 String wdate = dateFormat.format(date);
		 daily.setWdate(wdate);
		 daily.setWdef("lili");
		 System.out.println(service.update(daily));*/
		// Cg_ApplyService service2 =
		// application.getBean(Cg_ApplyService.class);
		// System.out.println(service2.findByCg_ApplyId(1));

	}
}
