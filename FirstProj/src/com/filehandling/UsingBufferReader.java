package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {

	public static void main(String[] args) {
	//reading file using buffer reader class
		
	  try {
			File f= new File("D:/my files/new.text");
		
	// we have to pass filreader class object inside buffer reader class constructor
 // filreader it is use to read the file and 
			//bufferedreader is use to buffer that particular content and fetching the value
				
		BufferedReader br = new BufferedReader(new FileReader(f));
			
			System.out.println("file cont is ");
			
			int c=0;
			while((c=br.read())!=-1)	
			{
				System.out.print((char) c);
			}
			
			br.close();
		} 
		
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

}
