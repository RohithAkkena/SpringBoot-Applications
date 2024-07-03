package com.rohith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rohith.model.Users;
import com.rohith.repo.UserRepo;

@Controller
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	@RequestMapping("/addUser")
	public String registerForm()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveUser(Users users,ModelMap model)
	{
		repo.save(users);
		return "success";
	}
	@RequestMapping(value="/viewUsers", method=RequestMethod.GET)
	public String viewAllUsers(ModelMap model)
	{
		model.put("users",repo.findAll());
		return "viewUsers";
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		repo.deleteById(id);
		return "/viewUsers";
	}
	@RequestMapping(value="/update/{id}")
	public String edit(@PathVariable int id, ModelMap model) {
		Users user=repo.findById(id).get();
		model.addAttribute("command", user);
		return "edituser";	
	}
	@RequestMapping(value="/editu" ,method=RequestMethod.POST)
 public  String editSave(@RequestParam String name,
		 @RequestParam String email, @RequestParam String password,
		 @RequestParam String gender, @RequestParam String country, Users user, ModelMap model) {
	  repo.save(user);
	 return "redirect:/viewUsers";
	 
 }
}
