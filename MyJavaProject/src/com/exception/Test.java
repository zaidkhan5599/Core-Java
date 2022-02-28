package com.exception;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		System.out.println("Executing");
		try {
			System.out.println("Operation done");
			System.out.println(10/0);
			System.out.println("Not completed");
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should be greater than zero");
		}
		System.out.println("Executed");
		System.out.println("Main Method Ended");
	}

}
