package com.arrays;

public class Arr5 {

	public static void main(String[] args) {
		
		//how to sort the array element.
		//sort the array element by ascending order 
		
		int arr[]= {99,6,7,8,5,23,3,4,1,43};

		System.out.println("array before sorting :");
		
		for (int i: arr)
		{
			System.out.println(" "+i);
		}
		for(int i=0;i<=arr.length-1;i++) {
			
		
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]<arr[j])
			{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			
		}
		}
			
			
		}
		System.out.println("============");
		System.out.println("Sorted Array will be: ");
		for(int i: arr) {
			System.out.print(","+i);
	}
		
	}
}
