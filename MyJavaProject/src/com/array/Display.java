//Write a program to create an integer array of a given length and store 
//the first n numbers inside the array. Take input from user.
package com.array;

import java.util.Scanner;

public class Display {

	static void disp(int n,int []a) {
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		disp(n,arr);
	}

}
