package Sid.sfgid.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Sid.sfgid.Services.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(@Qualifier("I18nService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

}
