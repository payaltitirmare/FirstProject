package com.arrays;

public class Serching {

		
		public static void main(String[] args) {

			int a[] = {10,20,30,40,30,40};
			
			int element=30;
			int index = 0;
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==element)
				{
					index=i;
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.println("array is found at location"+" "+index);
			}
			else {
				System.out.println("array is not found at any location");
				
			}
		}
	}

