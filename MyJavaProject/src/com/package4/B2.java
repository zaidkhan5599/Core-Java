package com.package4;

public class B2 {

	public static void main(String[] args) {
		System.out.println(B1.i);
		B1 ob=new B1();
		System.out.println(ob.j);
	}

}
class B3 extends B1{
	public static void main(String[] args) {
		System.out.println(B1.i);
		B1 ob=new B1();
		System.out.println(ob.j);
	}
}