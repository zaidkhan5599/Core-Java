package com.hashcode;

public class MainClass {

	public static void main(String[] args) {
		A1 ob1=new A1(10,'a');
		A1 ob2=new A1(10,'b');
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		A2 ob3=new A2(20,'c',false,10.0,"hi");
		A2 ob4=new A2(20,'c',false,10.0,"hi");
		System.out.println(ob3.equals(ob4));
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println("hi".hashCode());
		
	}

}
