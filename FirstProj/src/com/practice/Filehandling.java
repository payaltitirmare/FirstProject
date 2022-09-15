package com.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) {
	
		File object = new File("D:/my files/first.txt");  //
		
		if(object.exists())
		{
			System.out.println("the file name is :"+object.getName());
			
			System.out.println("the file path is :"+object.getPath());
			
			System.out.println("the file is writable or not :"+object.canWrite());
			
			System.out.println("the file is readable or not :"+object.canRead());
			
			System.out.println("the length of file in bytes :"+object.length());
		}
	}

}
