package com.kk.SpringCoreDemo.Lifecycle;

public class Car {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting car name");
		this.name = name;
	}
	
	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Inside init");
	}
	
	public void destroy() {
		System.out.println("Inside destroy");
	}
}
