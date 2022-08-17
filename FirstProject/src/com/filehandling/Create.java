package com.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {

	public static void main(String[] args)  {

                      //creataing a new file...........
		//1)creat object of file class
		//2) create path.filename
		//3) referencename.createNewFile()----call this method.
	File file= new File("C://Users//cw//OneDrive//Documents//java io files//firstio.docs");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("enter valid path");
			e.printStackTrace();
		}
	

                       //writing a file..................................
	try {
		 FileWriter filewriter = new FileWriter("C://Users//cw//OneDrive//Documents//java io files//firstio.docs");
		filewriter.write("welcome to codeograph solutions...\n hello everyone\n here i am going to make\n one new file");
		filewriter.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	    
}
}