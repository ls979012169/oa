package com.oa.web;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oa.html.LoginObject;
import com.oa.pojo.Employee;
import com.oa.service.EmployeeService;
import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 登录控制器
 */
@Controller
public class LoginController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/login")
	public @ResponseBody LoginObject login(String name, String pass, HttpSession session,
			HttpServletResponse response) {
		EmployeeVO employeeVO = employeeService.find(name, pass);
		LoginObject loginObject = new LoginObject();
		if (employeeVO == null) {
			loginObject.setResult("登录失败！");
			loginObject.setEmployeeVO(employeeVO);
		} else {
			loginObject.setResult("登陆成功！");
			loginObject.setEmployeeVO(employeeVO);
		}
		// 将当前登录的员工放入session中
		session.setAttribute("employeeVO", employeeVO);
		/** 设置响应头允许ajax跨域访问 **/
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		// response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		return loginObject;
	}

}
