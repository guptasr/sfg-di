package Sid.sfgid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Sid.sfgid.controller.ConstructorInjectedController;
import Sid.sfgid.controller.I18nController;
import Sid.sfgid.controller.PropertyInjectedController;
import Sid.sfgid.controller.SetterInjectedController;
import Sid.sfgid.controller.myController;

@SpringBootApplication
public class SfgIdApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgIdApplication.class, args);
		
		I18nController i18nconttroller =(I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nconttroller.sayHello());
		
		myController mycontroller = (myController) ctx.getBean("myController");
		
		System.out.println("_______________Primary");
		
		System.out.println(mycontroller.sayHello());
		
		System.out.println("_______________Property");
		
		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("_______________Setter");
		
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("_______________Constructor");
		
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
		
	}

}
