 package com.oa.web;

import java.util.List;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.oa.pojo.Baoxiao;
import com.oa.service.BaoxiaoService;
import com.oa.vo.BaoXiaoVO;

/**
 * @author wl
 * @category 报销表控制器
 *
 */
@Controller
@RequestMapping("/baoXiao")
public class BaoXiaoController {
	Logger log = Logger.getLogger(BaoXiaoController.class);
	@Resource
	private BaoxiaoService baoxiaoService;
	@RequestMapping("/bxlist")
	public @ResponseBody List<BaoXiaoVO> bxlist(){
		 List<BaoXiaoVO> bxlist=baoxiaoService.find();
		return bxlist;//返回所有报销集合列表
	}
	@RequestMapping("/findById")
	public @ResponseBody List<BaoXiaoVO> findById(Integer bid){
		List<BaoXiaoVO> baoxiao=baoxiaoService.findById(bid);
		return baoxiao;//根据报销科目编号返回报销集合列表
	}
	@RequestMapping("/findlist")
	public @ResponseBody List<BaoXiaoVO> findlist(Integer uid){
		List<BaoXiaoVO> baoxiao=baoxiaoService.findlist(uid);
		return baoxiao;//根据申请人编号返回报销集合列表
	}
	@RequestMapping("/findByBid")
	public @ResponseBody BaoXiaoVO findByBid(Integer id){
		BaoXiaoVO baoXiao=baoxiaoService.findByBid(id);
		return baoXiao;//根据报销编号返回报销集合列表
	}
	@RequestMapping("/findBySid")
	public @ResponseBody List<BaoXiaoVO> findBySid(Integer sid){
		List<BaoXiaoVO> baoXiao=baoxiaoService.findBySid(sid);
		return baoXiao;//根据状态编号返回报销集合列表
	}
	@RequestMapping("/addBaoxiao")
	public String addBaoxiao(Baoxiao baoxiao){
		baoxiaoService.add(baoxiao);
		return "redirect:bxlist.action";
	}
	@RequestMapping("/deleteById")
	public String deleteById(int [] ids){
		baoxiaoService.delete(ids);
		return "redirect:bxlist.action";
	}
	@RequestMapping("/update")
	public String update(Integer id,int sid){
		BaoXiaoVO baoXiaoVO=baoxiaoService.findByBid(id);
		baoXiaoVO.setSid(sid);
		baoxiaoService.update(baoXiaoVO);
		return "redirect:bxlist.action"; 
	}
}