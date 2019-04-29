package org.abousaid.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller
@CrossOrigin(origins="*")
@RestController
public class BasicAuthenticationController { 
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at ***_***");
		return new AuthenticationBean("You are authenticated");
	}

}
