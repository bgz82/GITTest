package com.bhargav.spring.sample.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bhargav.spring.sample.entities.User;
import com.bhargav.spring.sample.services.UserService;

@Controller
public class HomeController {

	private ApplicationContext context;
	
	public HomeController()
	{
	   context = SpringApplicationContext.getInstance();	
	}
	
	@RequestMapping(value= "/", method=RequestMethod.GET)
	public String getLoginpage(Model model)
	{
		return "login";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getUserData(Model model)
	{
		UserService uService = (UserService)context.getBean("userService");
		List<User> userList = uService.getList();
		model.addAttribute("userList",userList);
		return "home";
	}
	
}
