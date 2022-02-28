package com.method;

public class MethodDemo {
	
	static void test() {
		System.out.println("from test");
		return;
	}
	public static void main(String[] args) {
		System.out.println("from main");
		test();
		System.out.println("main ends");
	}

}
