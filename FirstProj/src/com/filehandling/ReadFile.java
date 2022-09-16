package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	
	public static void main(String[] args) throws IOException {
		
		//filinputstream
		
		File f= new File("D:/my files/new.text");
		
	
		try {
			FileInputStream fip = new FileInputStream(f);
			System.out.println("file content is :");
			
			
			int c=0; 
			
			while((c=fip.read())!=-1)  // keep reading file
				//when file is end it will  retuen -1 so before that it will return false
			{
				System.out.print((char)c);  //if we directly print value then it will give corresponding  ascii number
				//so thats why we typecast here
			}
			
			fip.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		

	}

}
