package com.Equals;

public class E1 {

	public static void main(String[] args) {
		A ob=new A(10);
		A ob1=new A(10);
		System.out.println(ob);//A@100
		System.out.println(ob1);//A@200
		System.out.println(ob.equals(ob1));
		System.out.println(ob1.equals(ob));
		System.out.println(ob.equals(ob));
	}

}
