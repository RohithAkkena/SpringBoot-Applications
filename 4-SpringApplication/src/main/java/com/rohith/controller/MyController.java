package com.rohith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String numberpage() {
		return "numbers";
	}
	@RequestMapping("/big")
	public String printbiggest(@RequestParam int fnum, @RequestParam int snum, @RequestParam int tnum, ModelMap model) {
		model.put("FirstNumber", fnum);
		model.put("SecondNumber", snum);
		model.put("ThirdNumber", tnum);
		int bignum=0;
		if(fnum>snum && fnum>tnum) {
			bignum=fnum;
		}
		else if(snum>tnum && snum>fnum){
			bignum=snum;
		}
		else
			bignum=tnum;
		model.put("Biggestnumber", bignum);
		
		return "result";
		
	}

}
