package com.nonstatic;

public class P10 {
	int a;
	void test(int a) {
		System.out.println(a);//1
		this.a=a;
		System.out.println(this.a);//1
	}
	public static void main(String[] args) {
		P10 ob=new P10();
		System.out.println(ob.a);//0
		ob.test(1);
	}

}

