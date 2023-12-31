package day7.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import day7.entities.Employee;

public class HibernateUtils {
	//This is a utility class for obtaining SessionFactory.
		public static SessionFactory getSessionFactory() {
			System.out.println("Configuring Hibernate Programmatically...");
			Configuration hibernateConfig = new Configuration();
			//Specifying the Entity class
			Class<Employee> entityClass = Employee.class;
			hibernateConfig.addAnnotatedClass(entityClass);//This is equivalent to <mapping resource = "Employee.hbm.xml">
			
			//Specifying the properties
			Properties hibernateProps = new Properties();
			hibernateProps.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
			hibernateProps.put("hibernate.connection.url","jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false");
			hibernateProps.put("hibernate.connection.username","root");
			hibernateProps.put("hibernate.connection.password","password");	
			hibernateProps.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
			hibernateProps.put("hibernate.show_sql","true");
			hibernateProps.put("hibernate.hbm2ddl.auto","update");
			
			hibernateConfig.setProperties(hibernateProps);		
			
			SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
			return hibernateFactory;
			
}
}