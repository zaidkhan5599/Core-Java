package com.constructor;
public class C13 {
	int x,y,z;
	C13(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
	}
	public static void main(String[] args) {
		C13 c=new C13(1,2,3);
		System.out.println("++++++++++");
		C13 c1=new C13(100,122,1323);
	}
}