package com.mpack;

public class A1 {
	void test() {
		System.out.println("From test of A()");
	}

}
class B extends A1{
	void test() {
		System.out.println("from test of B()");
	}
	public static void main(String[] args) {
		B ob= new B();
		ob.test();
	}
}