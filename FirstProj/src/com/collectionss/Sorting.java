package com.collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	//by using collection ....
	public static void main(String[] args) {


		ArrayList <Integer> marks = new ArrayList <>();
		
		marks.add(12);
		marks.add(34);
		marks.add(6);
		
		System.out.println(marks);
		
		//marks.forEach(System.out::println);
		Collections.sort(marks);
		System.out.println(marks);
		
	}

}
