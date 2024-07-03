package com.rohith.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	@RequestMapping("/")
		public String homepage() {
			return "home";
		}
	@RequestMapping("/about")
	public String aboutpage() {
		return "about";
	}
	@RequestMapping("/contact")
	public String contactpage() {
		return "contact";
		
	}
	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}
	@RequestMapping("/register")
	public String regpage() {
		return "register";
	}
	
	
	
	
}
