package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dev.pojo.User;
import com.dev.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="showuser")
	public String test(Model model,@RequestParam("id")Long id){
		
		User user = userService.selectUserById(id);
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping(value="deleteuser")
	@ResponseStatus(value=HttpStatus.OK)
	public void test(@RequestParam("id") Long id) {
		
		userService.deleteUserById(id);
	}
}
