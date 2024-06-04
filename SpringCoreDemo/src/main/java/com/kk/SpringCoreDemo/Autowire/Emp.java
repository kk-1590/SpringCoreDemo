package com.kk.SpringCoreDemo.Autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		System.out.println("inside constructor");
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}
	
	
	
}
