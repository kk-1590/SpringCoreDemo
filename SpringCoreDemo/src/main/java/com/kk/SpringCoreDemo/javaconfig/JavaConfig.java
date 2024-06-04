package com.kk.SpringCoreDemo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan(basePackages = "com.kk.SpringCoreDemo.javaconfig") */
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	@Bean(name= {"student","temp"})
	public Student getStudent() {
		//create new object
		
		Student student = new Student(getSamosa());
		return student;
	}
}
