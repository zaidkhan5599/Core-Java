package com.array;

import java.util.Scanner;

public class Average {

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
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println(a[i]);
//			}
//		}
//		double total=0;
//		for(int i=0;i<size;i++) {
//			total+=a[i];
//		}
//		double avg=total/size;
//		System.out.println("Average of an array is "+avg);
		int flag=0;
		int i=0;
		int j=a.length-1;
		while(i<j) {
				
				if(a[i]==a[j]) {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			i++;
			j--;
			}
		
		if(flag==1) {
			System.out.println("palindrome ");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
