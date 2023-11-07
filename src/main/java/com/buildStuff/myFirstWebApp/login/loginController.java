package com.buildStuff.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	@RequestMapping("login")
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String getWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
}
