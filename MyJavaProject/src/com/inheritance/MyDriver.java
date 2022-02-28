package com.inheritance;

public class MyDriver {

	public static void main(String[] args) {
		A2 a1=new A2();
		System.out.println(a1.i);
		a1.i=45;
		System.out.println(a1.i);
		B2 b=new B2();
		System.out.println(b.i);
		b.i=24;
		System.out.println(b.i);
		System.out.println(b.j);
	}

}
