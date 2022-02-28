package com.constructor;

public class C1 {

	C1(){// can be execute when objects are created
		System.out.println("from c1()");
	}
	public static void main(String[] args) {
		System.out.println("From main");
		C1 o=new C1();
		C1 o2=new C1();// 
	}

}
