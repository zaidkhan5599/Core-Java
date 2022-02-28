package com.nonstatic;

public class NSMethod {
	void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		NSMethod ns=new NSMethod();
		ns.test();
	}

}
