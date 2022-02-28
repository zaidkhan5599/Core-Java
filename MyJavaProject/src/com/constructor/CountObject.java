package com.constructor;

public class CountObject {
	static int count;
	{
		count++;
	}
	CountObject(){
		
	}
	CountObject(int x){
		
	}
	public static void main(String[] args) {
		CountObject c=new CountObject();
		CountObject c1=new CountObject(1);
		System.out.println(new CountObject());
		new CountObject(2);
		System.out.println(count);
		
		
	}

}
