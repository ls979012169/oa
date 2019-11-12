package com.oa.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.pojo.Task;
import com.oa.service.TaskService;
import com.oa.service.TypeService;
import com.oa.vo.TaskVO;

import aj.org.objectweb.asm.Type;

public class wyrTest1 {

	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		TaskService taskService = context.getBean(TaskService.class);
		/* System.out.println(taskService.findAll()); */
		/*
		 * System.out.println(taskService.findByEid(4));
		 * System.out.println(taskService.findByTid(5));
		 */
	}

	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		TypeService typeService = context.getBean(TypeService.class);

	}

	@Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		TaskService taskService = context.getBean(TaskService.class);
		List<TaskVO> list = taskService.findAll();
		for (TaskVO taskVO : list) {
			System.out.println(taskVO.getTid());
		}

		/*
		 * System.out.println(taskService.findByEid(2));
		 * System.out.println(taskService.findByTid(1)); 添加任务
		 * System.out.println(taskService.add(task)); 修改任务
		 * System.out.println(taskService.update(task));
		 */

	}

}
