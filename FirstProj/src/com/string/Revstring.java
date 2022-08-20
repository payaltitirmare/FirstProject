package com.string;

public class Revstring {



		public static void main(String[] args) {
		
			String str="codeograph";
			
			String rev= " ";
			
		/*	for(int i=len-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			
			System.out.println(rev);
			*/
			char[] arr=str.toCharArray();
			
			for(int i=arr.length-1;i>=0;i--) {
				rev=rev+arr[i];
			}
			System.out.print(rev);
		}

	}  
	
	
	
		