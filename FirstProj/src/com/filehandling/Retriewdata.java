package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Retriewdata {

	public static void main(String[] args) throws IOException {
	
	File f = new File("D:/my files/practice.text");
	
	//retrieve data from filr
	
	try {
		FileReader fr = new FileReader(f);
		
		
		int c = 0;
		
		while((c=fr.read()) !=-1)
		{
			System.out.print((char) c);
		}
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
