package com.buildStuff.myFirstWebApp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello!, how are you";
	}
}
