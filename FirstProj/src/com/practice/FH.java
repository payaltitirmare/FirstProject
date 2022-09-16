package com.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FH {

	public static void main(String[] args) {

		File f= new File("D:/my files/new.text");
		
		try {
			
			
			if(f.createNewFile())
			{
				System.out.println("file created succefully");
			}
			else
			{
				System.out.println("file is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			FileWriter fw= new FileWriter("D:/my files/new.text");
			fw.write("i want to beacome a full stack web developer....");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
