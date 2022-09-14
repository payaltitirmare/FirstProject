package com.MathsProblem;

import java.util.Scanner;

public class CountVowels {
	

	
	public static void main(String[] args) {
	
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the string: ");
	        String str = in.nextLine();
	        CountVowels cs = new CountVowels();
	        cs.count_Vowels(str);
	        int c=cs.count_Vowels(str);
	        System.out.println(c);
	       }
		
	
	public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}