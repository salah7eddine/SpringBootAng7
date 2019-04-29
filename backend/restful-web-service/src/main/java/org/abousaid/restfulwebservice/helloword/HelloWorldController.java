package org.abousaid.restfulwebservice.helloword;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@CrossOrigin(origins="*")
@RestController
public class HelloWorldController { 
	
	// GET
	// URI - /hello-world
	// method - "hello World"
	// @RequestMapping(path = "/hello", method = RequestMethod.GET)
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World - changed";
	}
	// /hello-world/path-variable/gone
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	// hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at ***_***");
		return new HelloWorldBean("Hello World - Changed");
	}

}
