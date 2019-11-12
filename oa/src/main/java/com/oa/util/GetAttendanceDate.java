package com.oa.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * @author xxl
 * @category 实时考勤表工具类
 */
public class GetAttendanceDate {

	/**
	 * 得到i天前的日期
	 * 
	 * @param i
	 * @throws ParseException
	 */
	public static String getAttendanceDate(int i) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long dif = 0;
		try {
			dif = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getTime() - 86400 * 1000 * i;
		} catch (ParseException e) {
			e.printStackTrace();
		} // 减一天
		Date date = new Date();
		date.setTime(dif);
		String day = sdf.format(date);
		return day;
	}

	@Test
	public void test1() {
		System.out.println(GetAttendanceDate.getAttendanceDate(2));
	}

}
