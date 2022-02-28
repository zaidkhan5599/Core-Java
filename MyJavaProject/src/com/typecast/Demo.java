package com.typecast;

public class Demo {

	static void add(double a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add(10,20);
		add(10.0,20.0);
		add('1','b');
	}

}
