package com.oa.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oa.dao.EmployeeDao;
import com.oa.pojo.Employee;
import com.oa.pojo.File;
import com.oa.service.EmployeeService;
import com.oa.service.FileService;
import com.oa.vo.EmployeeVO;

/**
 * @author Song
 * @category 员工测试
 */
public class Test6 {

	@Test
	public void test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring.xml");
		EmployeeService service = context.getBean(EmployeeService.class);
		//Employee employee = service.findById(5);
		//<!-- 添加 -->
		/*employee.setEname("天天");
		employee.setPassword("123");
		employee.setSex("女");
		employee.setTel("159235786");
		employee.setBid(1);
		employee.setZid(2);
		Date Date = new Date();
		employee.setDate(Date);
		System.out.println(service.add(employee));*/
		//<!-- 删除员工页面 -->
		/*System.out.println(service.delete(4));*/
		//<!-- 查询 -->
		//System.out.println(service.find("xxl", "123"));
		/*更新员工*/
       /* employee.setEname("宝宝");
        employee.setPassword("321");
		employee.setSex("女");
		employee.setTel("879165368");
		employee.setBid(2);
		employee.setZid(6);
		Date Date = new Date();
		employee.setDate(Date);
		System.out.println(service.update(employee));*/
		/*根据员工名称查找*/
		//Employee employee = new Employee();
		System.out.println(service.findByUserName("xxl"));
		/*查询出来所有的员工集合 ，除了管理员以外*/
		//System.out.println(service.find("xxl", "123"));
		/*根据职位编号查询*/
		//EmployeeVO employeevo = new EmployeeVO();
		//System.out.println(service.findBypname(1));
	}
	
	@Test
	public void test2(){
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring.xml");
		//FileService fileService = context.getBean(FileService.class);
		/*查询1*/
		//File file = new File();
		//System.out.println(fileService.find1(2));
		/*查询2*/
		//System.out.println(fileService.find2("wew"));
		/*添加*/
		/*file.setAtitle("娜娜");
		file.setEid(5);
		file.setAdept("兰兰");
		Date Date = new Date();
		file.setAdate(Date);
		file.setLian("然然");
		System.out.println(fileService.add(file));*/
		/*删除文件页面 */
		/*System.out.println(fileService.delete(2));*/
		/*更新文件*/
		/*File file= fileService.find1(5);
		file.setAtitle("姗姗");
		System.out.println(fileService.update(file));*/
		/*查询出来所有的文件集合*/
	}
}
