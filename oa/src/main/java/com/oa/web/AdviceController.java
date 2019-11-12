package com.oa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Aff;
import com.oa.service.AffService;

/**
 * @author xxl
 * @category 信息中心控制器
 */

@Controller
@RequestMapping("/xinXi")
public class AdviceController {

	@Autowired
	private AffService affService;

	// 待改
	@RequestMapping("/addAdvice")
	public @ResponseBody String addAdvice(String content) {
		Aff aff = new Aff();
		// af.setTitle(title);
		aff.setContent(content);
		Boolean flag = affService.add(aff);
		String result = null;
		if (flag) {
			result = "创建成功！";
		} else {
			result = "创建失败！";
		}
		return result;
	}

	// 待改
	@RequestMapping("/showAdvice")
	public @ResponseBody List<Aff> showAdvice() {
		List<Aff> affs = affService.findAll();
		return affs;
	}

	// 待改
	@RequestMapping("/searchByTitle")
	public @ResponseBody List<Aff> searchByTitle(String title) {
		Aff aff=new Aff();
		aff.setTitle(title);
		List<Aff> affs=affService.findByTitle(aff);
		return affs;
	}
	

}
