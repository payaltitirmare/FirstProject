package com.arrays;

public class Revarray {

	public static void main(String[] args) {
		
	/*	int[] arr = { 10,56,24,78,23};
		
	   float[] marks= {98.5f,45.5f,79.5f,99.5f,80.5f,99.7f};
		String[] students= {"harry","payal","saurabh","rohan"};
		System.out.println(students.length);
		System.out.println(students [2]);
		System.out.println(marks.length);
	 
	*/	
		
	//2-d array
		
		int[] marks;
		int[][] flats;
		flats =new int [2][3];
		flats[0][0]=101;
		flats[0][1]=102;
		flats[0] [2]=103;
		flats[1][0]=104;
		flats[1][1]=105;
		flats[1][2]=106;
		
		System.out.println("printing a 2-d arrays using for loop");
		for(int i=0; i<flats.length;i++) {
			for(int j=0;j<flats[i].length;j++) {
				System.out.println(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
	/*	int sum=0;
		for(int i=arr.length-1;i>=0; i--)
		{
			
		System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
		}
		System.out.println(" sum of array is : "+sum);
		
		System.out.println("=============================================================================");
		

	for(int a:arr)
	{
		System.out.println(a);
	}
	*/
	
	
}
}
