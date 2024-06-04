package com.kk.SpringCoreDemo.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kk/SpringCoreDemo/Autowire/auto_config.xml");		
		
		/* Emp emp = (Emp)context.getBean("emp"); */
		/*
		 * Emp emp = context.getBean("emp",Emp.class); System.out.println(emp);
		 */
		
		
		 Emp1 emp = context.getBean("emp1",Emp1.class);
		 System.out.println(emp);
		 
		
		/*
		 * Emp2 emp2 = context.getBean("emp2",Emp2.class);
		 * System.out.println(emp2.getName()); System.out.println(emp2.getPhones());
		 * System.out.println(emp2.getAddresses());
		 * System.out.println(emp2.getCourses());
		 * System.out.println(emp2.getPhones().getClass().getName());
		 * System.out.println(emp2.getCourses().getClass().getName());
		 */
	}
}
