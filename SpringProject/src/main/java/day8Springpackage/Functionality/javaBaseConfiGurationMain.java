package day8Springpackage.Functionality;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Springpackage.GreetingService;

public class javaBaseConfiGurationMain {

	public static void main(String[] args) {
		

AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		
		//Registering the configuration unit: SpringConfig
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		annoCtx.register(configurationUnit);
		
		//Refreshing the context
		annoCtx.refresh();
		
		Object obj = annoCtx.getBean("helloBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		
		obj = annoCtx.getBean("welcomeBean");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		  
		
		obj = annoCtx.getBean("myUserBean1");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		Object o1 = annoCtx.getBean("greetingBean");
		Object o2 = annoCtx.getBean("greetingBean");
		System.out.println(o1 == o2);

	}

}