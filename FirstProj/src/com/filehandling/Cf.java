package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cf {

	public static void main(String[] args) {
		
	/*	File file = new File("D://java notes//myfile.txt");
		
		try {
			if(file.createNewFile())
			{
				System.out.println("file is created");
			}
			else
				System.out.println("file is not created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
		
		try {
			FileWriter filewriter = new FileWriter("D://java notes//myfile.txt");
			
			 filewriter.write("hello this is me payal\n i am learning java");
			 
			 filewriter.close();		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

}
