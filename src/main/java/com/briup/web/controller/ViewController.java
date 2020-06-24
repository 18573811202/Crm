package com.briup.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.briup.bean.User;

/** 
* @author 作者 zcg: 
* @version 创建时间：Mar 26, 2020 3:30:04 PM 
* 类说明:	
* 	用来映射thymeleaf页面的Controller类
*/
@Controller
public class ViewController {
	
	@RequestMapping("login")
	public String toLoginPage() {
		//返回thymeleaf的逻辑视图名
		return "login";
	}
	
	@RequestMapping("index")
	public String toIndexPage(HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
		if(user==null) {
			return "login";
		}
		
		return "index";
	}
	
}














