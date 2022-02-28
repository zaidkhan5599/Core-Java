package com.array;
import java.util.Scanner;
public class DemoArray {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int a[];// Declaration
		a=new int[size]; // Initialization
		//Entering elements in array
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i+"th element");
			a[i]=s.nextInt();
		}
		//displaying the contents in array
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		double total=0;
		for(int i=0;i<size;i++) {
			total=total+a[i];
		}
		double avg=total/size;
		System.out.println("Average of array is :"+avg);
		
	}
}
