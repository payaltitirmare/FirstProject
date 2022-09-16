package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UsingFileReader {

	public static void main(String[] args) {
	
		//using fileReader class
		
		try {
			File f= new File("D:/my files/new.text");
		
	 FileReader fr = new FileReader(f);
	 
	 System.out.println("content is ");
	
	 int c=0;
	
	 while((c= fr.read())!=-1)
	 {
		System.out.print((char)c);
	 }
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
