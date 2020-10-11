package Sid.sfgid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Sid.sfgid.Services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("propertyGreetingService")
	GreetingService greetingServices;
	
	public String getGreeting() {
		
		return greetingServices.sayGreeting();
	}

}
