package com.oa.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Task;
import com.oa.service.TaskService;
import com.oa.vo.TaskVO;

/**
 * 个人任务控制器
 * 
 * @author wyr
 *
 */
@Controller
public class TaskController {

	Logger log = Logger.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;

	/**
	 * 通过员工id查询该员工的所有任务
	 * 
	 * @param eid
	 * @return
	 */
	@RequestMapping("/showTaskByEid")
	public @ResponseBody List<TaskVO> showTaskByEid(Integer eid) {
		List<TaskVO> taskVOs = taskService.findByEid(eid);
		return taskVOs;
	}

	/**
	 * 根据任务ID编号，查询个人任务
	 * 
	 * @param tid
	 * @return
	 */
	@RequestMapping("/showTaskByTid")
	public @ResponseBody TaskVO showTaskByTid(Integer tid) {
		TaskVO taskVO = taskService.findByTid(tid);
		return taskVO;
	}

	/**
	 * 根据部门ID查询该部门所有员工的个人任务
	 * 
	 * @param bid
	 * @return
	 */
	@RequestMapping("/showTaskByBid")
	public @ResponseBody List<TaskVO> showTaskByBid(Integer bid) {
		List<TaskVO> taskVOs = taskService.findByBid(bid);
		return taskVOs;
	}

	/**
	 * 增加个人任务
	 * 
	 * @param task
	 * @return
	 */
	@RequestMapping("/addTask")
	public @ResponseBody String addTask(Task task) {
		Boolean flag = taskService.add(task);
		String result = null;
		if (flag) {
			result = "添加成功！";
		} else {
			result = "添加失败！";
		}
		return result;
	}

	/**
	 * 删除个人任务
	 * 
	 * @param tid
	 * @return
	 */
	@RequestMapping("/delTask")
	public @ResponseBody String delTask(Integer tid) {
		Boolean flag = taskService.delete(tid);
		String result = null;
		if (flag) {
			result = "添加成功！";
		} else {
			result = "添加失败！";
		}
		return result;
	}

	/**
	 * 更新个人任务
	 * 
	 * @param task
	 * @return
	 */
	@RequestMapping("/upTask")
	public @ResponseBody String upTask(Task task) {
		Boolean flag = taskService.update(task);
		String result = null;
		if (flag) {
			result = "更新成功！";
		} else {
			result = "更新失败！";
		}
		return result;
	}
}
