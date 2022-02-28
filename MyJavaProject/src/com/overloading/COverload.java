package com.overloading;

public class COverload {
	public COverload() {
		System.out.println("From Default Cons");
	}
	COverload(int a){
		this();
		System.out.println("From Cons(int) "+a);
	}
	COverload(int a,int b){
		this(a);
		System.out.println("From COns(int,int) "+a+" "+b);
	}
	public static void main(String[] args) {
		COverload c=new COverload();
		COverload c1=new COverload(1);
		COverload c2=new COverload(10,20);
	}
}
