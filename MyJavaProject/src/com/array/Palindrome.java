package com.array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[];
		int size;
		System.out.println("enter size of array");
		size=s.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+i+"th element ");
			a[i]=s.nextInt();
			
		}
		int count=0;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]==a[a.length-1-i]) {
				count++;
				
			}
		}
		
		if(size/2==count) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a plaindrome");
		}
	}

}
