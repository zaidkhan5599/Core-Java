package com.inheritance;

public class B1 extends A1 {
	static int j=20;
	static
	{
		System.out.println("from SIB of B1");
	}
	public static void main(String[] args) {
		System.out.println("From main");
		System.out.println(B1.i);
		System.out.println(B1.j);
		System.out.println("main ends");
		
	}

}
