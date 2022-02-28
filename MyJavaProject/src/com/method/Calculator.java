//Write a program to display method for calculator.
package com.method;

public class Calculator {

	static void add(int a,int b) {
		System.out.println(a+b);  	//Addition
	}
static void sub(int a,int b) {
	System.out.println(a-b);		//Substraction
	}
static void mul(int a,int b) {
	System.out.println(a*b);		//Multiplication
}
static void div(int a,int b) {
	System.out.println(a/b);		//Division
}
static void mod(int a,int b) {
	System.out.println(a%b);		//Modulus
}
	public static void main(String[] args) {
		add(10,20);				//Method call
		sub(50,10);
		mul(5,5);
		div(10,3);
		mod(9,2);
	}

}
