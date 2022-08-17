package com.collectionss;

public class Emp {

	private String name;
	private String phone;
	private int empId;
	
	public Emp(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	
	public String getname()
	{
		return name;
	}

	public String  getphone()
	{
		return phone;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
}
