package com.nonstatic;

public class P9 {
	int a;
	void test() {
		int a=20;
		System.out.println(a);
		//this.a=200;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		P9 ob=new P9();
		System.out.println(ob.a);
		ob.a=100;
		ob.test();
		System.out.println(ob.a);
	}

}
