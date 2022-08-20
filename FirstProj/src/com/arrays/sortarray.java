package com.arrays;

public class sortarray {

	public static void main(String[] args) {
		
		/*
		int[] arr= {99,6,7,8,5,43,23,3,4,1,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j])
				{
				arr[i]=arr[i]+arr[j];	
				arr[j]=arr[i]-arr[j];	
				arr[i]=arr[i]-arr[j];	
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(" , "+i);
		}
		*/
		
		boolean isSorted=true;
		int[] arr= {99,6,7,8,5,43,23,3,4,1,2};
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					isSorted=false;
					break;
				}
			}
			
		}
		if(isSorted) {
			System.out.println("sorted array");
		}
		else 
		{
			System.out.println("unsorted array");
		}
		
		//----------------sort the string --------------------------------
		
		System.out.println("sorted array be like ---------");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
				arr[i]=arr[i]+arr[j];	
				arr[j]=arr[i]-arr[j];	
				arr[i]=arr[i]-arr[j];	
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(" , "+i);
		}
	}
	
}
		
		