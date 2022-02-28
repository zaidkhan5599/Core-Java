package com.nonstatic;

public class P7 {

	int a=10;
	void test() {
		System.out.println(this);
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		P7 ob=new P7();
		System.out.println(ob);
		System.out.println(ob.a);
		ob.test();
		P7 ob1=new P7();
		System.out.println(ob1);
		System.out.println(ob1.a);
		ob1.test();}

}
