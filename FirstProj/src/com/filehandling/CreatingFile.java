package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CreatingFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C://Users//cw//OneDrive//Documents//java io files//Sample.text");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("enter valid path");
			e.printStackTrace();
		}
		System.out.println(file.length());
		
		
		
			FileOutputStream fos=new FileOutputStream(file,true);
		
		String str="welcome to codeograph";
		
		char arr[] =str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			try {
				fos.write(arr[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("length:--"+""+file.length());	
	}

}
