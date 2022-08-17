package com.arrays;

public class Prac1 {

	//reverse the array
	public static void main(String[] args) {

		int a[] = {40,55,34,98,12,77,65};
		
		int rev=0;
		
		/*for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			*/
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						a[i]=a[i]+a[j];
						a[j]=a[i]-a[j];
						a[i]=a[i]-a[j];
				
					}
				}
				}
			for(int t:a)
				System.out.print(" ,"+t);
			System.out.println(" ");
			
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(","+a[i]);
			}
			}
	}



