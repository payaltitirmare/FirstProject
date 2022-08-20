package com.arrays;

public class Practice1 {

	public static void main(String[] args) {
// 1)create float array and calculate sum
		
		/*float[] arr= {12.5f,11.5f,13.5f,14.5f,15.5f};
		
		float sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum +arr[i];
		}
		System.out.println(sum);
		System.out.println("average is"+sum/arr.length);  */
		
		
//2) write a program to find out whether a given integer 
		//is present in an array or not
		
		int [] arr1= {13,24,54,28,33,49};
		int num=18;
		//int count=0;
		boolean inarray=false;
		for(int i=0;i<arr1.length;i++) {
			
			if(num==arr1[i])
			{  //count++;
				inarray=true;
				//System.out.println("element found "+arr1[i]+" at location "+i);
			    break;	
			}
			
		}
		
		if(inarray) {
			System.out.println("present in array");
		}
		else
		{
			System.out.println("not present");
		}
		
	}
}


