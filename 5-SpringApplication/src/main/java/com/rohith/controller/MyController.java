package com.rohith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String resultmarks() {
		return "marks";
	}
	@RequestMapping("/req1")
	public String printresult(@RequestParam String fname, @RequestParam String lname,@RequestParam double fee, @RequestParam String hno, @RequestParam int hb, @RequestParam int spring, @RequestParam int sb, ModelMap model ) {
		String fullname=fname+lname;
		model.put("Fullname", fullname);
		model.put("Coursefee", fee);
		model.put("H_marks", hb);
		model.put("S_marks", spring);
		model.put("Sb_marks", sb);
		
		int total=hb+spring+sb;
		model.put("Totalmarks", total);
		double percentage=total/3;
		model.put("Percentage", percentage);
		String grade=null;
		String result=null;
		
		if(hb>35 && spring>35 && sb>35)
		{
			if(percentage>=70) {
				grade="A grade";
				result="pass";
				
			}
			else if(percentage>=60 && percentage<70) {
				grade="B grade";
				result="pass";
				
			}
			else if (percentage<60 && percentage<=50) {
				grade="C grade";
				result="pass";
				
			}
			else {
				grade="D grade";
				result="pass";
			}
		}
		else {
			grade="F grade";
			result="fail";
	}
		model.put("grade", grade);
		model.put("result", result);
		
		return "result";
		
	}

}
