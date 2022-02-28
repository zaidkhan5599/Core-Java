//Write a program to display a method which can print 
//all the numbers till given limit.
package com.method;

public class LimitNumber {

	static void printNumber(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int n=20;
		printNumber(n);
	}

}
