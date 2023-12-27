package day9Springpackage;

import org.springframework.stereotype.Component;

@Component
public class ThirdTest {
	public ThirdTest() {
		System.out.println("Third Test instantiated");
	}
	public void doTest() {
		System.out.println("Third test works...");
	}

}


