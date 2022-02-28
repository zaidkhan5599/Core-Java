package com.constructor;

public class C14 {
	int x;
	C14(){
		x=10;//intializing value during object creation
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("from main");
		C14 c=new C14();
		C14 c1=new C14();
	}

}
