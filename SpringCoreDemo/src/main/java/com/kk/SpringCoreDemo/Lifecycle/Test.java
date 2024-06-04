package com.kk.SpringCoreDemo.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/kk/SpringCoreDemo/Lifecycle/config.xml");
		//registering shutdown hook
		context.registerShutdownHook();
		
		/*
		 * Car car = (Car)context.getBean("car"); System.out.println(car);
		 * 
		 * 
		 * System.out.println("------------------------"); Pepsi pepsi =
		 * (Pepsi)context.getBean("pepsi"); System.out.println(pepsi);
		 */
		
		Example ex = (Example)context.getBean("ex");
		System.out.println(ex);
		
	}

}
