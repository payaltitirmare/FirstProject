package com.arrays;

public class Maxarray {

	public static void main(String[] args) {
		int[] arr= {17,25,30,87,56,76,35,83};
		
		//for maximum number 
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
			max=arr[i];
		}
		}
   System.out.println("maximum number is :"+max);
   
   //for minimum number 
    
   int min=arr[0];
	    for(int i=1;i<arr.length;i++) {
		if(min>arr[i]) {
		min=arr[i];
	
		}
	    }
	    System.out.println("minimum number is :"+min);
	}
	
}
	