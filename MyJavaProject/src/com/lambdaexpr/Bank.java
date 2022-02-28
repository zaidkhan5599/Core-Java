package com.lambdaexpr;

public class Bank {
	double balance=5000;
	public void withDraw(int amount) {
		if(amount>balance) {
			System.out.println("Amount is greater than balance ");
			System.out.println("Please deposit");
		}
	}
	public static void main(String[] args) {

	}

}
