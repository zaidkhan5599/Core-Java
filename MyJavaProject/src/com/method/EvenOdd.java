//Write a program to check whether given number is even or odd.
package com.method;

public class EvenOdd {

	static boolean evenOdd(int n) {
		return (n%2==0);
	}
	public static void main(String[] args) {
			int a=11;
		//	boolean b=evenOdd(a);
			if(evenOdd(a)) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
	}

}
