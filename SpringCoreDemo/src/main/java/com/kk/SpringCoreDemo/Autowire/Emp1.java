package com.kk.SpringCoreDemo.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Emp1 {
	@Autowired
	@Qualifier("address2")	
	private Address1 address;

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp1() {
		super();
		System.out.println("inside constructor");
		// TODO Auto-generated constructor stub
	}

	public Emp1(Address1 address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}
	
	
	
}
