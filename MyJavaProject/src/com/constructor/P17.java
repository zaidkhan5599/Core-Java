package com.constructor;

public class P17 {
	int x;
	static int y;
	P17(){
		System.out.println(this);
		x=10;
		y=20;
	}
	public static void main(String[] args) {
		P17 ob=new P17();
		System.out.println(ob);
		System.out.println(ob.x);
		System.out.println(y);
		P17 ob2=new P17();
		System.out.println(ob2);
		System.out.println(ob2.x);
		System.out.println(y);
	}

}
