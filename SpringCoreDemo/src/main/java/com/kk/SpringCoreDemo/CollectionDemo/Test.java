package com.kk.SpringCoreDemo.CollectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kk/SpringCoreDemo/CollectionDemo/cconfig.xml");
		/*
		 * Emp emp1 = (Emp)context.getBean("emp1");
		 * 
		 * System.out.println(emp1.getName()); System.out.println(emp1.getCourses());
		 * System.out.println(emp1.getAddresses());
		 */
		
		/*
		 * A obj1 = (A)context.getBean("aref");
		 * 
		 * System.out.println(obj1.getX()); System.out.println(obj1.getB().getY());
		 */
		
		/* Person pers = (Person)context.getBean("person1"); */
		
		Addition add = (Addition)context.getBean("add");
		
		add.sum();
	}

}
