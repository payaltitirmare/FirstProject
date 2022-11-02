package com.codeo.ums.entity;

public class User {

	private int id =0;
	private String name=null;
	private String email= null;
	private String country = null;
	

	public User(int id, String email, String name, String country) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	    this.country = country;
	}
	
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}


	public User() {
		
	}


	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", id=" + id + ", country=" + country + "]";
	}

}
