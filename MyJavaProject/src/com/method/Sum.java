//Write a program to design a method which can accept two numbers and 
//return the sum.
package com.method;

public class Sum {

	static int add(int x,int y) {
		return (x+y);				
	}
	public static void main(String[] args) {

		int a=56;
		int b=94;
		int res = add(a,b);
		System.out.println("Sum is "+res);
	}

}
