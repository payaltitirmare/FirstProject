package com.collectionss;

public class Comparator1 implements Comparable<Comparator1>{

	//this is program for comparable....
	private int id;
	private String name;
	private int age;
	
	static {
		
		System.out.println("miet students");
	}
	
	public Comparator1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Comparator1 o) {
		
		return this.id - o.id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Comparator1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



}
