package com.nonstatic;

public class P6 {
	int x=10;
	void test() {
		System.out.println(this);
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		P6 ob=new P6();
		System.out.println(ob.x);
		System.out.println(ob);
		ob.test();
	}

}
