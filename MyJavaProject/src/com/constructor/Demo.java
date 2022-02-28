package com.constructor;

public class Demo {
	Demo(){
		this(2.0);
		System.out.println("from Demo()");
	}

	Demo(int x){
		this();
		System.out.println("from Demo(int)");
	}
	Demo(double d){
		System.out.println("From Double");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo(100);
	}
}
