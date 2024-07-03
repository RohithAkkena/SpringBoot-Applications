package com.rohith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rohith.web.model.User;
@Controller
public class Usercontroller {
	
	@RequestMapping("/")
	public String regform(ModelMap model) {
		User user=new  User();
		model.put("User", user);
		return "reg";
		
	}
	
	@RequestMapping("/register")
	public String registerformdetails(@ModelAttribute User user,ModelMap model) {
		model.put("Users", model);
		return "result";
	}

}
