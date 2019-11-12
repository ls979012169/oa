package com.oa.util;

import java.util.List;

/**
 * @author xxl
 * @category 判断考勤的工具类
 */
public class JudgeAttendance {

	/**
	 * 判断考勤情况
	 * 
	 * @param list
	 *            存储了员工某天的打卡信息
	 * @return String 该员工本日的考勤情况
	 */
	public static String judge(List<String> list) {
		String result = null;
		// 打卡次数
		int size = list.size();
		// 根据打卡次数进行考勤判断
		if (size == 0) {
			result = "缺勤";
		} else if (size == 1) {
			String kqTime = list.get(0).substring(11, 19);
			if (kqTime.compareTo("06:00:00") > 0 && kqTime.compareTo("09:00:00") < 0) {
				// 1.已有的打卡记录在上午6点到9点之间
				result = "异常：下午未打卡！";
			} else if (kqTime.compareTo("18:00:00") > 0 && kqTime.compareTo("23:00:00") < 0) {
				// 2.已有的打卡记录在上午18点到23点之间
				result = "异常：上午未打卡！";
			} else {
				// 3.已有的打卡记录不在上下班时间段
				result = "异常：仅" + kqTime + "打卡一次";
			}
		} else {
			String kqTimeAM = list.get(0).substring(11, 19);
			String kqTimePM = list.get(1).substring(11, 19);
			if (kqTimeAM.compareTo("06:00:00") > 0 && kqTimeAM.compareTo("09:00:00") < 0) {
				// 1.当上午打卡正常时
				if (kqTimePM.compareTo("18:00:00") > 0 && kqTimePM.compareTo("23:00:00") < 0) {
					// 下午打卡也正常时
					result = "正常";
				} else {
					// 下午打卡不正常时
					result = "早退";
				}
			} else {
				// 2.当上午打卡不正常时
				if (kqTimePM.compareTo("18:00:00") > 0 && kqTimePM.compareTo("23:00:00") < 0) {
					// 下午打卡正常时
					result = "迟到";
				} else {
					// 下午打卡不正常时
					result = "迟到/早退";
				}
			}
		}
		return result;
	}

}
