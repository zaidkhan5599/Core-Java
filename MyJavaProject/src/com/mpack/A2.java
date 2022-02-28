package com.mpack;

public class A2 {
	void test() {
		System.out.println("From tset of A2");
	}

}
class B2 extends A2{
	protected void test() {
		System.out.println("From test of B2");
	}
}
