package com.tcs.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class RegistrationController {
	
	@Autowired
	
	UserRepository userrepo;
	
	@GetMapping("/signup")
	public String method()
	{
		return "registration";
	}
	
	//if we have few paramters then we use  @RequestParam  if their are more number of paramters are present
	//the we used diffrent approach case 2 below are 
	
	/*
	 * @PostMapping("/register") public String registerUser(@RequestParam String
	 * userName,@RequestParam String password) { if(userName.length()>=8 &&
	 * password.length()>=8) { return "success"; } else { return "registration"; } }
	 */
	//case 2 here we have created the object User and trying to access the username and 
	//password values using the getters method from the class
	@PostMapping("/register") public String registerUser(@ModelAttribute User user,Model model) {
		if(user.getUserName().length()>=8 && user.getPassword().length()>=8) { 
			User newUser=userrepo.save(user);
			model.addAttribute("uid",newUser.getUserID());
			model.addAttribute("uname", newUser.getUserName());
			model.addAttribute("password", newUser.getPassword());
			return "success";
			} 
		else { return "registration"; }
	}
	

}
