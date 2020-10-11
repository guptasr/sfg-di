package Sid.sfgid.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.AssertJProxySetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sid.sfgid.Services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;
	
	
	@BeforeEach
	void setup() {
		
		controller=new ConstructorInjectedController(new ConstructorGreetingService());
		
	}

	@Test
	void getGreetings() {
		System.out.println(controller.getGreeting());
	}

}
