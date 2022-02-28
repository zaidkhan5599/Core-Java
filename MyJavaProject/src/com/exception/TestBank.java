package com.exception;

public class TestBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setBalance(10000);
		System.out.println(b.getBalance(2580));
		System.out.println(b.withDraw(3000));
		System.out.println("Available bal is :"+b.withDraw(2000));
		
		
	}

}
