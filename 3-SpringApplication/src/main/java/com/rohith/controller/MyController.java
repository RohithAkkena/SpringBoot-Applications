package com.rohith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String nameform() {
		return "name";
	}
	@RequestMapping("/req1")
	public String printFullName(@RequestParam String fname,
			@RequestParam String lname, ModelMap model) {
		model.put("FirstName", fname);
		model.put("LastName", lname);
		String fullname=fname+" "+lname;
		model.put("FullName", fullname);
		return "result";
	}
	

}
