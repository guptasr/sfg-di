package Sid.sfgid.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sid.sfgid.Services.ConstructorGreetingService;

class PropertyInjectedControllerTest2 {

PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingServices = new ConstructorGreetingService();
	}

	@Test
	public void test() {
		System.out.println(controller.getGreeting());
	}

}
