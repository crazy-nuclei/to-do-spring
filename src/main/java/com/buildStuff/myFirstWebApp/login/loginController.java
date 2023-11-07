package com.buildStuff.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("login")
	public String getLoginPage() {
		return "login";
	}
}
