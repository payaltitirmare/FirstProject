package com.string;

public class SwapString {

	public static void main(String[] args) {
		
		String s="payalt";

		System.out.println(swap(s));
	}

		public static String swap(String s) {
			
			char[] ch = s.toCharArray();
			  
	        // Traverse the character array
	        for (int i = 0; i < ch.length - 1; i += 2) {
	  
	            // Swapping the characters
	            char temp = ch[i];
	            ch[i] = ch[i + 1];
	            ch[i + 1] = temp;
	        }
	  
	        // Converting the result into a
	        // string and return
	        return new String(ch);
			
		}
}
