package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Apply;
import com.oa.service.ApplyService;
import com.oa.vo.ApplyVO;

/**
 * @author cjg
 * @category 考勤控制器
 */
@Controller
@RequestMapping("/kaoQin")
public class KaoQinController {
	public static final Logger log = Logger.getLogger(KaoQinController.class);
	@Resource
	private ApplyService applyService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/applylist")
	public @ResponseBody List<ApplyVO> applylist() {
		List<ApplyVO> applylist = applyService.findAll();
		return applylist;
	}

	/**
	 * @param id
	 *            请假申请编号
	 * @return 返回根据请假申请编号查询请假申请对象
	 */
	@RequestMapping("/findById")
	public @ResponseBody ApplyVO findById(Integer id) {
		ApplyVO apply = applyService.findById(id);
		return apply;
	}

	/**
	 * @param sid
	 *            请假申请状态编号
	 * @return 返回根据请假申请状态编号查询请假申请
	 */
	@RequestMapping("/findBySid")
	public @ResponseBody List<ApplyVO> findSid(Integer sid) {
		List<ApplyVO> applyVOs = applyService.findBySid(sid);
		return applyVOs;
	}

	/**
	 * @param uid
	 *            员工编号
	 * @return 返回根据员工编号查询到的请假申请对象
	 */
	@RequestMapping("/findByUid")
	public @ResponseBody List<ApplyVO> findByUid(Integer uid) {
		List<ApplyVO> applyVOs = applyService.findByUid(uid);
		return applyVOs;
	}

	/**
	 * @param apply
	 *            请假申请对象
	 * @return 添加请假申请对象后重定向到列表展示控制器
	 */
	@RequestMapping("/addApply")
	public String addApply(Apply apply) {
		applyService.add(apply);
		return "redirect:applylist.action";
	}

	/**
	 * @param id
	 *            请假申请编号
	 * @return 删除请假申请对象后重定向到列表展示控制器
	 */
	@RequestMapping("/delete")
	public String deleteAppByID(Integer id) {
		applyService.delete(id);
		return "redirect:applylist.action";
	}

	/**
	 * @param id
	 *            请假申请编号
	 * @param sid
	 *            审核状态编号
	 * @return 更新请假申请对象后重定向到列表展示控制器
	 */
	@RequestMapping("/update")
	public String updateAppByID(Integer id, int sid) {
		ApplyVO applyVO = applyService.findById(id);
		applyVO.setSid(sid);// 更改审核状态 （同意：sid=2;不同意：sid=3）
		applyService.update(applyVO);
		return "redirect:applylist.action";
	}

}
