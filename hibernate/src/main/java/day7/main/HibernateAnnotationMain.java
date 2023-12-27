package day7.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import day7.entities.Employee;
import day7.utils.HibernateUtils;

public class HibernateAnnotationMain {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Employee emp =new Employee(1,"izhar",9797,"khan@gamil.com",123);
		
		Transaction tx = session.beginTransaction();
		session.save(emp);
	tx.commit();
	session.close();
	factory.close();
	System.out.println("Record added.");
	}

}
