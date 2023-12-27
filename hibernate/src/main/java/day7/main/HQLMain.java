package day7.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import da7.bean.NameAndphone;
import day7.entities.Employee;
import day7.utils.HibernateUtils;

public class HQLMain {
	
	
	private  static void constructorExpressionExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		String hqlQuery = "select new day7.bean.NameAndphone(rs.name, rs.phone) from Employee rs";
		Query<NameAndphone> hibernateQuery = 	session.createQuery(hqlQuery);
		List<NameAndphone> employeeList = hibernateQuery.list();
		for(NameAndphone data : employeeList)
			System.out.println(data);
		session.close();
		factory.close();
	}
	
	
	private static void selectClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		//Builing HQL query for loading name and branchCount
		String hqlQuery = "select rs. employee_email, rs. employee_name from Employee rs";
		Query<Object[]> hibernateQuery =session.createQuery(hqlQuery);
		List<Object[]> restaurantDataList = hibernateQuery.list();
		for(Object[] employeetData : restaurantDataList) {
			Object restemail = employeetData[0];
			Object restname = employeetData[1];
			System.out.println(restemail + "  " + restname+ " ");			
		}
		session.close();
		factory.close();
	}
	
	private static void fromClauseExample() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		//Builing HQL query
		String hqlQuery = "from Employee rs";
		//Obtaining a reference of type 'Query'
		Query<Employee> hibernateQuery  = 	session.createQuery(hqlQuery);
		//Obtaining a List of Restaurant objects
		List<Employee> restaurantList = 	hibernateQuery.list();
		/*
		 * for(Restaurant rst : restaurantList) System.out.println(rst);
		 */
		restaurantList.stream().forEach((rst) -> System.out.println(rst.getEmployee_email()));
		session.close();
		factory.close();
	}


	public static void main(String[] args) {
		
		 //fromClauseExample();
		selectClauseExample();
		//constructorExpressionExample();
		
	}

}
