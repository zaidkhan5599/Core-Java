package com.stati;

public class P1 {
	static int test=10;
	static void test() {
		System.out.println(test);
	}
	public static void main(String[] args) {
		int test=20;
		System.out.println(test);
		System.out.println(P1.test);
		test();	
		P1.test();
	}

}
