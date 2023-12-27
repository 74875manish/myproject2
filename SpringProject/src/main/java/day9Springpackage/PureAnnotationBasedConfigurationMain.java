package day9Springpackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigurationMain {
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
			
	}
}