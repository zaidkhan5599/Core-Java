package com.inheritance;
public class B extends A {
	static int y;
	public static void main(String[] args) {
		System.out.println(B.x);
		System.out.println(B.y);
		A.x=10;
		System.out.println(B.x);
	}
}
