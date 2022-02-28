package com.nonstatic;

public class P11 {
	int x;
	void assign(int x) {
		System.out.println(this.x);//0
		this.x=x;
		System.out.println(this.x);//10
	}
	public static void main(String[] args) {
		System.out.println("Main begins");
		P11 a=new P11();
		a.assign(10);
		System.out.println("Main Ends");
		
	}

}
