package com.hashcode;

public class H1 {

	public static void main(String[] args) {
		A ob=new A(10);
		A ob1=new A(10);
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob.equals(ob1));
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
	}

}
