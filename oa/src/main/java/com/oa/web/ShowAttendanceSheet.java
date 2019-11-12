package com.oa.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.html.AttendanceToShow;
import com.oa.service.AttendanceService;
import com.oa.service.EmployeeService;
import com.oa.util.GetAttendanceDate;
import com.oa.util.JudgeAttendance;
import com.oa.vo.AttendanceVO;
import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 考勤情况表
 */
@Controller
public class ShowAttendanceSheet {

	@Autowired
	private AttendanceService attendanceService;

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/showAttendanceSheet")
	public @ResponseBody List<List<AttendanceToShow>> showAttendanceSheet() {
		// 要查看的7天的日期
		String day1 = GetAttendanceDate.getAttendanceDate(7);
		String day2 = GetAttendanceDate.getAttendanceDate(6);
		String day3 = GetAttendanceDate.getAttendanceDate(5);
		String day4 = GetAttendanceDate.getAttendanceDate(4);
		String day5 = GetAttendanceDate.getAttendanceDate(3);
		String day6 = GetAttendanceDate.getAttendanceDate(2);
		String day7 = GetAttendanceDate.getAttendanceDate(1);
		// 用于存储所有员工最近7天的考勤情况
		List<List<AttendanceToShow>> list = new ArrayList<List<AttendanceToShow>>();
		// 用于存储单个员工最近7天的的考勤情况
		List<AttendanceToShow> attendanceToShows = new ArrayList<AttendanceToShow>();
		// 查询出所欲员工
		List<EmployeeVO> employeeVOs = employeeService.findUserList();
		// 遍历所有员工
		for (EmployeeVO employeeVO : employeeVOs) {
			List<AttendanceVO> attendanceVOs = attendanceService.findlist(employeeVO.getEid());
			List<String> listDay1 = new ArrayList<String>();
			List<String> listDay2 = new ArrayList<String>();
			List<String> listDay3 = new ArrayList<String>();
			List<String> listDay4 = new ArrayList<String>();
			List<String> listDay5 = new ArrayList<String>();
			List<String> listDay6 = new ArrayList<String>();
			List<String> listDay7 = new ArrayList<String>();
			for (AttendanceVO attendanceVO : attendanceVOs) {
				// 本条打卡记录的日期
				String date = attendanceVO.getDate().substring(0, 10);
				if (day1.equals(date)) {
					listDay1.add(attendanceVO.getDate().substring(11, 19));
				} else if (day2.equals(date)) {
					listDay2.add(attendanceVO.getDate().substring(11, 19));
				} else if (day3.equals(date)) {
					listDay3.add(attendanceVO.getDate().substring(11, 19));
				} else if (day4.equals(date)) {
					listDay4.add(attendanceVO.getDate().substring(11, 19));
				} else if (day5.equals(date)) {
					listDay5.add(attendanceVO.getDate().substring(11, 19));
				} else if (day6.equals(date)) {
					listDay6.add(attendanceVO.getDate().substring(11, 19));
				} else if (day7.equals(date)) {
					listDay7.add(attendanceVO.getDate().substring(11, 19));
				}
			}
			// 判断这7天的考勤情况
			String state1 = JudgeAttendance.judge(listDay1);
			String state2 = JudgeAttendance.judge(listDay2);
			String state3 = JudgeAttendance.judge(listDay3);
			String state4 = JudgeAttendance.judge(listDay4);
			String state5 = JudgeAttendance.judge(listDay5);
			String state6 = JudgeAttendance.judge(listDay6);
			String state7 = JudgeAttendance.judge(listDay7);
			// 将考勤情况存入结果中
			AttendanceToShow attendanceToShow = new AttendanceToShow(employeeVO.getEid(), employeeVO.getEname(),
					employeeVO.getDname(), employeeVO.getPname(), state1, state2, state3, state4, state5, state6,
					state7);
			list.add(attendanceToShows);
		}
		return list;
	}

	@Test
	public void test1() {
		Date time;

		/**
		 * 加一天
		 */
		try {
			time = new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-9");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(time);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			System.out.println("增加一天以后：" + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**
		 * 减一天
		 */
		try {
			long dif = new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-9").getTime() - 86400 * 1000;// 减一天
			Date date = new Date();
			date.setTime(dif);
			System.out.println("减少一天之后：" + new SimpleDateFormat("yyyy-MM-dd").format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long dif = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getTime() - 86400 * 1000;// 减一天
			Date date = new Date();
			date.setTime(dif);
			String day = sdf.format(date);
			System.out.println("减少一天之后：" + day);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
