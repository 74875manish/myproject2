package day8Springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Springpackage.GreetingService;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
	
			String configPath = "spring-config.xml";
			ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
			
			//Obtaining the object (bean) against its ID
			Object obj = ctx.getBean("myBean");
			GreetingService gs = (GreetingService)obj;
			String reply = gs.sayGreeting();
			System.out.println(reply);
			
			obj = ctx.getBean("myBean2");
			gs = (GreetingService)obj;
			reply = gs.sayGreeting();
			System.out.println(reply);
	}

}
