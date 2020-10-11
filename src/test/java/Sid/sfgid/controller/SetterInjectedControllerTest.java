package Sid.sfgid.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sid.sfgid.Services.ConstructorGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
