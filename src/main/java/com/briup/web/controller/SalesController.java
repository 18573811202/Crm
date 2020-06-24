package com.briup.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.bean.Chance;
import com.briup.bean.User;
import com.briup.service.ISalesService;
import com.briup.service.IUserService;

/** 
* @author 作者 zcg: 
* @version 创建时间：Apr 2, 2020 10:12:19 AM 
* 类说明 
*/
@Controller
public class SalesController {
	@Autowired
	private ISalesService service;
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("toSales")
	public String findSales(HttpSession session,
			String customer,@RequestParam(required = false) String address) {
		
		List<User> jinglis = userService.findByJingli(4);
		session.setAttribute("jinglis", jinglis);

		return "pages/sales";
	}
	
	@RequestMapping("addSales")
	@ResponseBody
	public String addSales(Chance chance,Integer creatorId,Integer handlerId) {
		
		service.insertChance(chance, creatorId, handlerId);
		
		return "添加成功";
	}
}













