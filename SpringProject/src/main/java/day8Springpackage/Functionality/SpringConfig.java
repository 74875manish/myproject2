package day8Springpackage.Functionality;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import Springpackage.GreetingService;
import Springpackage.HelloService;
import Springpackage.WelcomeService;
import day8Springpackage.userGreetingService;
import day8Springpackage.userService;
@Configuration //Marks this class as a Configuration Unit
@ComponentScan //Scans the classes annotated with '@Component'

public class SpringConfig {
	@Bean
	public GreetingService helloBean() {
		GreetingService service= new HelloService();
		return service;
	}
	
	@Bean
	public GreetingService welcomeBean() {
		GreetingService service = new WelcomeService();
		return service;
	}
	
	@Bean("myUserBean1") //Registers a bean of type UserService against an ID: myUserBean
	public GreetingService userBean() {
		GreetingService service = new userService();
		return service;
	}
	
	@Bean("greetingBean")
	@Scope("prototype")//<bean scope="prototype">
	@Lazy//<bean lazy-init="true">
	public GreetingService userGreetingBean() {
		GreetingService service = new userGreetingService("Welcome", 45, "Jack");
		return service;
	}
	
	
 
}
