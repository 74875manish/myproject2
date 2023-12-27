package ReferenceInjectionpPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceInjectionMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Object customerObject = ctx.getBean("myCustomer");
		System.out.println(customerObject);

	}

}
