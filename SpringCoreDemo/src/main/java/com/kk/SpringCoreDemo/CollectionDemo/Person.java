package com.kk.SpringCoreDemo.CollectionDemo;

public class Person {
	private String name;
	private int personId;
	private PersonDetails detail;
	
	public Person(String name, int personId,PersonDetails detail) {
		super();
		this.name = name;
		this.personId = personId;
		this.detail = detail;
	}
	
	public PersonDetails getDetail() {
		return detail;
	}

	public void setDetail(PersonDetails detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	
}
