package employeeinformation.beans;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import employeeinformation.utils.HibernateUtils;

public class CURDMain {
	
	
	private static void showRestaurantAgain() {
		//Use lazy=false for EAGER initialization
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Class<Employee> entityClassType = Employee.class;
		Serializable entityId = 111;
				
		Employee foundEmployee = session.load(entityClassType, entityId);
		System.out.println(foundEmployee.getClass().getName());
	
		System.out.println(foundEmployee.getEmployee_id());
		System.out.println(foundEmployee.getEmployee_id());
		System.out.println(foundEmployee.getEmployee_id());
		System.out.println(foundEmployee.getEmployee_id());
	
	}
	
	
	
	
	
	private static void deleteEmployee() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Employee> entityClassType =Employee.class;
		Serializable entityId = 112;//Serializable entityId  = new Integer(101);
		Employee foundEmployee = session.load(entityClassType, entityId);
		
		Transaction tx = session.beginTransaction();
			session.delete(foundEmployee);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record deleted");
	
	}

	private static void updateEmployee() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Employee> entityClassType = Employee.class;
		Serializable entityId = 111;//Serializable entityId  = new Integer(101);
		Employee foundemployee = session.load(entityClassType, entityId);
		
		Transaction tx = 	session.beginTransaction();
			foundemployee.setEmployee_name("masood");
			foundemployee.setEmployee_email("izharkhan@gamil.com");
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record updated");
		
	}
	
	
private static void ShowoneEmployee() {
	
	SessionFactory factory = HibernateUtils.getSessionFactory();
	Session session = factory.openSession();
	
	//Specifying the entity specific Class type using a reference of type 'Class' class
	Class<Employee> entityClassType = Employee.class;
	//Class<Employee> type = Employee.class;
	
	//Specifying the identity in the form of java.io.Serializable
	Serializable entityId = 112;//Serializable entityId  = new Integer(101);
	
	
	Employee foundemployee = session.load(entityClassType, entityId);
	System.out.println(foundemployee);
	session.close();
	factory.close();
	
}
	
	

	private static void createNewemployee() {
		//Building Configuration Object
		Configuration hibernateConfig = new Configuration();//Looks for hibernate.properties
		//Obtaining SessionFactory
		hibernateConfig = hibernateConfig.configure();//Looks for hibernate.cfg.xml
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		//Obtaining Session
		Session hibernateSession = hibernateFactory.openSession();
		//Creating Entity Class Object
		Employee rst = new 	Employee(112, "izhar", 807," @kh1.gmail", 999);
		//Obtaining and Starting 'Transaction' using 'Session'
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		//Attaching the Entity Class Object to the "Session'
			hibernateSession.save(rst);
		//Committing the 'Transaction'
		hibernateTransaction.commit();
		//Closing the Session
		hibernateSession.close();
		//Closing the SessionFactory
		hibernateFactory.close();
		System.out.println("employee created successfully.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createNewemployee();
		//ShowoneEmployee();
		//updateEmployee();
		deleteEmployee();
	}

}