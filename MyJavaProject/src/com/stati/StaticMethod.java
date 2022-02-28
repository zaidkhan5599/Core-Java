package com.stati;

public class StaticMethod {
		static int a=300;
	public static void main(String[] args) {
		int a=100;
		System.out.println(AccessStatic.a);
		System.out.println(StaticMethod.a);
		test();
	}
	static void test() {
		System.out.println(a);
		System.out.println(AccessStatic.a);
	}

}


