package com.example.demo.sub;


public class Employee {
	private int id;
	private String first_name;
	private String last_name;
	private String department;
	private String email_address;
	private String city;
	private String country;
	private int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
//		new EmployeeValidator().validateFirstName(first_name);
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
//		 new EmployeeValidator().validateLastName(last_name);
		this.last_name = last_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
//		new EmployeeValidator().validateDepartment(department);
		this.department = department;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
//		new EmployeeValidator().validateEmailID(email_address);
		this.email_address = email_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		//new EmployeeValidator().validatecityName(city);
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
//		new EmployeeValidator().validatecountryName(country);
		this.country = country;
	}
	public Employee(int id, String first_name, String last_name, String department, String email_address, String city,
			String country) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.department = department;
		this.email_address = email_address;
		this.city = city;
		this.country = country;
	}
	public Employee(String first_name, String last_name, String department, String email_address, String city,
			String country) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.department = department;
		this.email_address = email_address;
		this.city = city;
		this.country = country;
	}
	public Employee() {
		super();
		
	}





}
