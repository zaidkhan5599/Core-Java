package com.constructor;
public class P16 {
	P16(){
		System.out.println("From P16() ");
	}
	P16(int s){
		System.out.println("from P16(int)");
	}
	{
		System.out.println("From Ns block");
	}
	public static void main(String[] args) {
		P16 o=new P16();
		System.out.println("*******************");
		P16 o1=new P16(10);
	}
}