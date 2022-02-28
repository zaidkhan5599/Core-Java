package com.inheritance2;

public class Driver {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
//		System.out.println(a.j);
//		System.out.println(a.k);
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
//		System.out.println(b.k);
		C c=new C();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
	}

}
