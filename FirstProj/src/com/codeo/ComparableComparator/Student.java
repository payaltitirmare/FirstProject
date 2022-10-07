package com.codeo.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

	int age = 0;
	String name = null;
	String loc = null;
	
	public Student(int age, String name, String loc) {
		
		this.age = age;
		this.name = name;
		this.loc = loc;
	}

	@Override
	
	public int compareTo(Student o) {
		
		if(loc == o.loc)
		{
			return 0;
		}
		
		else if(loc!= o.loc)
		{
			return 1;
			
		}
		
		else 
		{ 
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", loc=" + loc + "]";
	}

	
	
	
	
	
}
