package com.arrays;
import java.util.Scanner;
public class Practice3 {

	//reverse a array
	
	public static void main(String[] args) {
		
		int[] arr= {12,14,17,25,10,66,98,34};
		
		System.out.println("length of array :"+arr.length);
		for (int i=arr.length-1;i>=0; i--) {
			
			System.out.println(arr[i]);
			
		} 
		System.out.println("========================");
		System.out.println(arr[6]);
		
		//from user using scanner class
		/*Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the nu. of arrays want");
		num=sc.nextInt();
		int[] arr=new int[10];   //create an array memory of length 10
		
		System.out.println("enter the array element one by one");
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
         System.out.println("array elements are :");
         for(int i=0;i<num;i++) {
        	 System.out.println(arr[i]);
         }*/
	}
}


