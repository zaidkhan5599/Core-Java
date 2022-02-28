package com.stati;

public class AccessStatic {
	static int a=20;
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		System.out.println(AccessStatic.a);
	}

}
