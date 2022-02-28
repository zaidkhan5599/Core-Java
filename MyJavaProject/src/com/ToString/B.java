package com.ToString;

public class B {
void m1() {
	System.out.println("from m1() of B");
}
public static void main(String[] args) {
	B ob=new A();
	ob.m1();
}

}
class A extends B{

	@Override
	void m1() {
		System.out.println("from m1() of A");
		super.m1();
		
	}
	
}
