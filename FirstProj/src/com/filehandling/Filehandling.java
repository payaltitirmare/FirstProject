package com.filehandling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException
	{

		File file=new File("D://internship data//payal.docs");
	      file.createNewFile();
	      System.out.println("The length of the file will be: "+file.length());

			FileOutputStream fos=new FileOutputStream(file);
			// In case (file,true) old content will exist as it is
			//new content will be append/concat with old content
			String str="Welcome to codeograph";
			
			//to convert this str String into char Array
			char arr[]=str.toCharArray();
			//w e l c o m e ..
			//arr[0] arr[1] .....
			for(int i=0;i<arr.length;i++) {
				fos.write(arr[i]);
			}
			 System.out.println("The length of the file will be: "+file.length());
	
	}
		
}
 