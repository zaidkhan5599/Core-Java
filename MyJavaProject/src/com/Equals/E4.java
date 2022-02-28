package com.Equals;

public class E4 {

	public static void main(String[] args) {
		C ob=new C(10,'a',"hello");
		C ob1=new C(10,'a',"hello");
		System.out.println(ob.equals(ob1));
		L1 ob2=new L1(20,'b',"hi",2.4);
		L1 ob3=new L1(20,'b',"hi",2.4);
		System.out.println(ob2.equals(ob3));
		//System.out.println(ob3.equals(ob));
		System.out.println("+++++++++++");
	}

}
