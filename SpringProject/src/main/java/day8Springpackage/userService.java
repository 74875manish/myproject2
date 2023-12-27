package day8Springpackage;

import Springpackage.GreetingService;

public class userService implements GreetingService {
	
	public userService () {
		System.out.println("UserService instantiated");
	}
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome User";
	}

}
