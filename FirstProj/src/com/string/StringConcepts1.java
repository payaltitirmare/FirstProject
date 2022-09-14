package com.string;

public class StringConcepts1 {

	
	int id ;
	String name;
	
	public StringConcepts1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
	
		StringConcepts1 sc = new StringConcepts1(22,"payal");
		
		//System.out.println(sc);
		
		System.out.println(sc.id+" "+ sc.name);
	}

	@Override
	public String toString() {
		return "StringConcepts1 [id=" + id + ", name=" + name + "]";
	}
	
}
