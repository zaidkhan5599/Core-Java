package com.scan;

import java.util.Scanner;

public class AcceptArray {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
