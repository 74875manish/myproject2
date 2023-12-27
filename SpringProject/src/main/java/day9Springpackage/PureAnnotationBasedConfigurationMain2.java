package day9Springpackage;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9Springpackage_fourth.FoureTest;
import day9Springpackage_fourth.another.AnotherFouthTest;


public class PureAnnotationBasedConfigurationMain2 {
	public static void main(String[] args) {

	Class<SpringAppConfig> configClass = SpringAppConfig.class;
	AnnotationConfigApplicationContext annoCtx = 
			new AnnotationConfigApplicationContext(configClass);
	//Loading a bean of type : FirstTest
	FirstTest firsttest=annoCtx.getBean(FirstTest.class);
	firsttest.doTest();
	//Loading a bean of type : SecondTest
	SecondTest secondTest = annoCtx.getBean(SecondTest.class);
	//Loading a bean of type : SecondTest
			SecondTest secondTest2 = annoCtx.getBean(SecondTest.class);
			secondTest.doTest();
			
			//Loading a bean of type : ThirdTest
		Object obj=annoCtx.getBean(ThirdTest.class);
			ThirdTest thirdTest =(ThirdTest) obj;
			thirdTest.doTest();
		
			
			System.out.println("-------------Accessing FourthTest bean------------------");
	FoureTest fourthTest=annoCtx.getBean(FoureTest.class);
	fourthTest.doTest();
	
	
	
	
	System.out.println("-------------Accessing Another FourthTest bean------------------");
	AnotherFouthTest anotherFourthTest = annoCtx.getBean(AnotherFouthTest.class);
	anotherFourthTest.doTest();
	
	
	System.out.println("-------------Accessing bean of type java.util.List------------------");
	
	obj = annoCtx.getBean("countries");
	List<String> listOfCountries = (List<String>)obj;
	listOfCountries.stream().forEach(ctr -> System.out.println(ctr));
	
			
	}
}