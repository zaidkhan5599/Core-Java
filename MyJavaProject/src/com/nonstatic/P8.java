package com.nonstatic;

public class P8 {

	static int a=8;
	int b;
	void test() {
		System.out.println(a);
		System.out.println(P8.a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
	}
	public static void main(String[] args) {

		P8 ob=new P8();
		ob.test();
		System.out.println(a);
		System.out.println(P8.a);
		System.out.println(ob.b);
		System.out.println(ob.a);
	}

}
