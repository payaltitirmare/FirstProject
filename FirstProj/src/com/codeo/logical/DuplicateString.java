package com.codeo.logical;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateString {

	// check the duplicate charcter at string 
	/*steps-- pass string refernce tp method 
	 * take collection concept 
	 * we dont want duplicate thats why take set ---- linkedlist for same order
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string here :");
		String name = sc.nextLine();
		
		FindDuplicate(name);
	}

	private static void FindDuplicate(String name) {
		
		Set <Character> duplicate = new LinkedHashSet<> ();
		
		for(int i=0 ; i<name.length(); i++)
		{
			for(int j= i+1; j<name.length(); j++)
			{
				if(name.charAt(i) == name.charAt(j) && name.charAt(i)!=' ')
				{
					duplicate.add(name.charAt(i));
				}
			}
		}
		
		System.out.println(duplicate);
		
	}

}
