package com.arrays;

public class Sumarray {

	public static void main(String[] args) {
		
		int arr[]= {99,6,7,8,5,43,23,3,4,1,2};
		
		int sum=0;
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
