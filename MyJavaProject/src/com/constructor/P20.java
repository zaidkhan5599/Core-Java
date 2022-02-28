package com.constructor;

public class P20 {
	int x;
	P20(){
		System.out.println("From P20 ");
		x=10;
	}
	{
		System.out.println("from IIB-1");
		System.out.println(x);
	}
	public static void main(String[] args) {
		P20 ob=new P20();
		
	}
	{
		System.out.println("from IIB2");
	}

}
