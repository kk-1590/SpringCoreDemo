package com.kk.SpringCoreDemo.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kk/SpringCoreDemo/Standalone/Collections/alone_config.xml");
		
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFeestructure().getClass().getName());
	}

}
