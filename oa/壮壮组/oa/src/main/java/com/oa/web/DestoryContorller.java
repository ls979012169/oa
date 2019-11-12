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
public class DestoryContorller {

	Logger log = Logger.getLogger(DestoryContorller.class);

	@Resource
	private DestoryService destoryService;

	@Resource
    private PropertyService propertyService;	
	// 查询所有报废信息
	@RequestMapping("/bf_listf")
	public @ResponseBody List<DestoryVO> listf() {
		List<DestoryVO> listf = destoryService.findAll();
		return listf;

	}

	// 根据资产报废id查询一条资产报废信息
	@RequestMapping("/bf_select")
	public @ResponseBody DestoryVO select(int id) {
		DestoryVO destoryVO = destoryService.select(id);
		return destoryVO;

	}

	@RequestMapping("/bf")
	public String addbf(Destory destory) {
		destoryService.insert(destory);
		int iid=destory.getIid();
		Property property=propertyService.findById(destory.getIid());//获得该物品库存对象
		int inumber=property.getInumber();//当前库存该物品总数
		int i=destory.getPcount();//获得该物品报废数量
		if(inumber>=i){
			property.setInumber(inumber-i);
			propertyService.update(property);
			return "redirect:bf_listf.action";
		}else{
			return "redirect:404.action";
		}
	}
	
	
	//propertyService.findById(destory.getIid());
	
	/*
	 * //查询所有报废信息
	 *
	 * @RequestMapping("/list") public String list(Model modle){
	 * log.debug("list..."); List<Destory> list = destoryService.findAll();
	 * System.out.println(list.size()); modle.addAttribute("list", list); return
	 * "list";
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/add") public String add() { return "add"; }
	 * 
	 * @RequestMapping("/addSave") public String addSave(Destory destory) {
	 * log.debug("destory.title:" + destory.getIid()); boolean flag =
	 * destoryService.insert(destory); log.debug("flag:" + flag); return
	 * "redirect:list.action"; }
	 * 
	 * @RequestMapping("/update") public String update(int id, Model model) {
	 * log.debug("id:" + id); Destory destory = destoryService.select(id);
	 * model.addAttribute("destory", destory); return "update"; }
	 * 
	 * @RequestMapping("/updateSave") public String updateSave(Destory destory)
	 * { log.debug("destory.title:" + destory.getIid()); boolean flag =
	 * destoryService.update(destory); log.debug("flag:" + flag); return
	 * "redirect:list.action"; }
	 * 
	 * @RequestMapping("/delete") public String delete(int ids) {
	 * log.debug("ids:" + ids); boolean flag = destoryService.delete(ids);
	 * log.debug("flag:" + flag); return "redirect:list.action"; }
	 */
}
