package com.hashcode;

public class H2 {

	public static void main(String[] args) {
		B ob=new B(10);
		B ob1=new B(10);
		B ob2=new B(100);
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob.equals(ob1));
		
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
		System.out.println(ob2.equals(ob1));
		System.out.println(ob2.hashCode());
	}

}
