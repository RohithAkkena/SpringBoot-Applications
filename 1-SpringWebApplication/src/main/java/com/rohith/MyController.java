package com.rohith;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/url")
	@ResponseBody
	public String index() {
		return "<h1> Welcome to Web Application</h1>";
	}
	

}
