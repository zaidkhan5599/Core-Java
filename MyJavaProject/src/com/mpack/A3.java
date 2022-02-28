package com.mpack;

public class A3 {
	void test() {
		System.out.println("from test of A3");
	}
	

}

class B3 extends A3{
	private void test() {
		System.out.println("from test of B3");
	}
}