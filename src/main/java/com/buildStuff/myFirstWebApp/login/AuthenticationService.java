package com.buildStuff.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public Boolean authenticate(String name, String password) {
		
		Boolean isValidName = name.equals("AA");
		Boolean isValidPassword = password.equals("AA");
		
		return isValidName && isValidPassword;
	}
}
