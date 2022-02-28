package com.constructor;

public class P18 {

	int x,y;
	P18(){
		
	}
	P18(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		P18 ob=new P18();
		System.out.println(ob.x);
		System.out.println(ob.y);
		P18 ob2=new P18(10,100);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
		System.out.println();
		
	}

}
