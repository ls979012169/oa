package com.oa.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Attendance;
import com.oa.service.AttendanceService;
import com.oa.vo.AttendanceVO;
import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 打卡签到
 */
@Controller
public class SignIn {

	@Autowired
	private AttendanceService attendanceService;

	/**
	 * 打卡签到
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/clockIn")
	public @ResponseBody String clockIn(HttpSession session) {
		String result = null;
		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employeeVO");
		int eid = employeeVO.getEid();
		// 获取当前日期和时间
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
		// 查询数据库中当前登录员工的全部打卡记录，取出其中的今日打卡信息存入集合todayAttendance中
		List<String> todayAttendance = new ArrayList<String>();
		List<AttendanceVO> attendanceVOs = attendanceService.findlist(eid);
		List<AttendanceVO> todayAttendanceVO = new ArrayList<AttendanceVO>();
		for (AttendanceVO attendanceVO : attendanceVOs) {
			String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(attendanceVO.getDate());
			if (date.substring(0, 10).equals(today)) {
				todayAttendance.add(date);
				todayAttendanceVO.add(attendanceVO);
			}
		}
		// 根据不同情况判断打卡
		Attendance attendance = new Attendance();
		// 1.今日打卡记录少于两条，直接添加一条打卡信息
		if (todayAttendance.size() < 2) {
			attendance.setEid(eid);
			attendance.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			attendanceService.add(attendance);
			result = "打卡成功！";
		} else if (todayAttendance.size() == 2) {
			// 2.今日已有两次打卡记录，更新第二次打卡信息
			AttendanceVO lastAttendance = todayAttendanceVO.get(1);
			Attendance attendance2 = new Attendance(lastAttendance.getId(), lastAttendance.getEid(),
					new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			attendanceService.update(attendance2);
			result = "打卡信息更新成功！";
		}
		return result;
	}

	@Test
	public void test1() {
		Date d1 = new Date(System.currentTimeMillis());
		String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(now);
		String testTime = "2020-11-08 16:42:26";
		Boolean flag = false;
		System.out.println(flag);
		if (now.compareTo(testTime) > 0) {
			flag = true;
		}
		System.out.println(flag);
		System.out.println(testTime.substring(0, 10));
		System.out.println(testTime.substring(11, 19));
	}
}
