package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Destory;
import com.oa.pojo.Property;
import com.oa.service.DestoryService;
import com.oa.service.PropertyService;
import com.oa.vo.DestoryVO;

/**
 * @author Administrator
 * @category 资产报废控制器
 */
@Controller
@RequestMapping("/destory")
public class DestoryContorller {

	Logger log = Logger.getLogger(DestoryContorller.class);

	@Resource
	private DestoryService destoryService;
	@Resource
	private PropertyService propertyService;

	/**
	 * @return 查询所有报废信息
	 */
	@RequestMapping("/bf_listf")
	public @ResponseBody List<DestoryVO> listf() {
		List<DestoryVO> listf = destoryService.findAll();
		return listf;

	}

	//
	/**
	 * @param id
	 *            报废编号
	 * @return 根据资产报废编号查询一条资产报废信息
	 */
	@RequestMapping("/bf_select")
	public @ResponseBody DestoryVO select(int id) {
		DestoryVO destoryVO = destoryService.select(id);
		return destoryVO;

	}

	/**
	 * 增加一条报废申请
	 * 
	 * @param destory
	 *            报废申请对象
	 * @return 重定向到查询所有控制器
	 */
	@RequestMapping("/bf")
	public String addbf(Destory destory) {
		destoryService.insert(destory);
		int iid = destory.getIid();
		Property property = propertyService.findById(iid);// 获得该物品库存对象
		int inumber = property.getInumber();// 当前库存该物品总数
		int i = destory.getPcount();// 获得该物品报废数量
		if (inumber >= i) {
			property.setInumber(inumber - i);
			propertyService.update(property);
			return "redirect:bf_listf.action";
		} else {
			return "redirect:404.action";
		}
	}

	/**
	 * @param ids
	 *            报废编号
	 * @return 重定向到查询所有控制器
	 */
	@RequestMapping("/delete")
	public String delete(int ids) {
		log.debug("ids:" + ids);
		boolean flag = destoryService.delete(ids);
		log.debug("flag:" + flag);
		return "redirect:bf_listf.action";
	}

}
