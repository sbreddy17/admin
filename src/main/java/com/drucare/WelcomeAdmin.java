package com.drucare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeAdmin {
	
	@GetMapping
	public String welcome() {
		return "welcome admin version ONE (welcome to drucare port 9090)";
	}

}
