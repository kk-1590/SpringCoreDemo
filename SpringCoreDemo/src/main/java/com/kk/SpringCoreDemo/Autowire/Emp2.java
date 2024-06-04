package com.kk.SpringCoreDemo.Autowire;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp2 {	
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Emp2 [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", props=" + props + "]";
	}
	
	
	
	
}
