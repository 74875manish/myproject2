package day9Springpackage;

import java.util.Arrays;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages = { "day9Springpackage","day9Springpackage_fourth"})
@Configuration
public class SpringAppConfig {
	
	
	@Bean
	public List<String> countries(){
		List<String> countryList = 
		Arrays.asList("Bharat", "Bhutan", "Nepal");
		return countryList;
	}
}

