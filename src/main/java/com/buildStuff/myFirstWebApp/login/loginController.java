package com.buildStuff.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	private AuthenticationService authenticationService;
	
	public loginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping("login")
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String getWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if (authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials, Please try again !");
		return "login";
	}
}
