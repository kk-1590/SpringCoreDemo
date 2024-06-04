package com.kk.SpringCoreDemo.Stereotype;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kk/SpringCoreDemo/Stereotype/stereo.xml");		
		
		Student student = context.getBean("ob",Student.class);
		/*
		 * System.out.println(student); System.out.println(student.getAddresses());
		 * System.out.println(student.getAddresses().getClass().getName());
		 */
		
		/*
		 * System.out.println(student.hashCode());
		 * 
		 * Student student1 = context.getBean("ob",Student.class);
		 * System.out.println(student1.hashCode());
		 */
		
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression expr = temp.parseExpression("5 > 8");
		try {
			System.out.println(expr.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
