package Sid.sfgid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Sid.sfgid.Services.GreetingService;

@Controller
public class SetterInjectedController {

	GreetingService greetingService;
	
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
	
	

}
