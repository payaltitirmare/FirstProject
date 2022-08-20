package com.filehandling;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Retriewdata {

	public static void main(String[] args) {
	
	public 	static String retrievefile(String data) {
			
			String getData="" ;
			
			getData =new String (Files.readAllBytes(Paths.get(data)));
		 ccreturn getdata;
		
		}
	
	
		String path="C://Users//cw//OneDrive//Documents//java io files// firstio.txt";
	
		System.out.println(retrievefile(path));
	
	
	
	}

}
