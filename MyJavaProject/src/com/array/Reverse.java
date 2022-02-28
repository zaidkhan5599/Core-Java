//Write a program to create an array and display array elements in reverse.
package com.array;

public class Reverse {

	public static void main(String[] args) {
		int a[]= {10,20,30,50};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}
}
