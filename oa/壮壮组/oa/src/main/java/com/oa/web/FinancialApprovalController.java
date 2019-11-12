package com.oa.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Baoxiao;
import com.oa.service.BaoxiaoService;
import com.oa.vo.BaoXiaoVO;
import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 财务审批控制器
 */
@Controller
public class FinancialApprovalController {

	@Autowired
	private BaoxiaoService baoxiaoService;

	/**
	 * 提交报销申请表
	 * 
	 * @param Baoxiao
	 * @return
	 */
	@RequestMapping("/applyBaoXiao")
	public @ResponseBody String applyBaoXiao(Baoxiao baoxiao) {
		String result = null;
		Boolean flag = baoxiaoService.add(baoxiao);
		if (flag) {
			result = "提交成功！";
		} else {
			result = "提交失败！";
		}
		return result;// 返回所有报销集合列表
	}

	/**
	 * 款项支付：展示待审核的报销申请表
	 * 
	 * @param session
	 * @return
	 */
	// 待改
	@RequestMapping("/showBaoxiaoToAudit")
	public @ResponseBody List<BaoXiaoVO> showBaoxiaoToAudit(Integer sid, HttpSession session) {
		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employeeVO");
		if (employeeVO.getBid() == 1) {
		} else {

		}
		return null;// 根据报销科目编号返回报销集合列表
	}

	/**
	 * 款项之故：展示已经通过审核或未通过审核的申请表
	 * 
	 * @param sid
	 *            审核状态
	 * @return
	 */
	@RequestMapping("/showBaoxiaoAudited")
	public @ResponseBody List<BaoXiaoVO> showBaoxiaoAudited(Integer sid) {
		return null;
	}

	/**
	 * 审核报销申请
	 * 
	 * @param id
	 * @param sid
	 * @return
	 */
	@RequestMapping("/auditBaoxiao")
	public @ResponseBody String auditBaoxiao(Integer id, Integer sid) {
		String result = null;
		BaoXiaoVO baoXiaoVO = baoxiaoService.findByBid(id);
		baoXiaoVO.setSid(sid);
		Boolean flag = baoxiaoService.update(baoXiaoVO);
		if (flag) {
			result = "审核成功！";
		} else {
			result = "审核失败！";
		}
		return result;
	}

	/**
	 * 财务统计：给echarts提供数据
	 * 
	 * @return
	 */
	@RequestMapping("/financialStatistics")
	public @ResponseBody String financialStatistics() {
		return null;
	}

}
