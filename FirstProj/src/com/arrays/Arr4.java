package com.arrays;

public class Arr4 {

	
	public static void main(String[] args) {

		int arr[]= {99,6,7,8,5,43,23,3,4,1};
		
		/*String str[]= {"codeo","graph","solution"};
		
		System.out.println("length of array: " +arr.length);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("for each loop");
		
		for(int i:arr) {
			System.out.println(i);
		} */
		
		int sum=0;
		int avg=0;
		for (int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		avg=sum/arr.length;
		}
		
		System.out.println("the sum will be: "+sum);
		System.out.println("the averagae will be: "+avg);
	

	for(int i=arr.length-1; i>=0 ; i--) {
		System.out.println(arr[i]);
	}
	}
}
