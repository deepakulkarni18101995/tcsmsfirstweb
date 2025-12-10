package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  //handles incoming request
@RequestMapping("/test")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
//@GetMapping
	public String method(Model model) {
		model.addAttribute("NAME","Deepa Kulkarni");
		model.addAttribute("DOB", "17/03/1997");
		model.addAttribute("COUNTRY","INDIA");
		
		return "hello";
	}
}
