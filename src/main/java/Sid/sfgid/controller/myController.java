package Sid.sfgid.controller;

import org.springframework.stereotype.Controller;

import Sid.sfgid.Services.GreetingService;

@Controller
public class myController {
	
	private final GreetingService greetingService;
	
	public myController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello()
	{
		
		return greetingService.sayGreeting();
	}

}
