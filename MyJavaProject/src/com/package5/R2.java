package com.package5;
import com.package4.B1;
public class R2 extends B1{
	
	public static void main(String[] args) {
		System.out.println(R2.i);
		R2 ob=new R2();
		System.out.println(ob.j);
		B1 ob2=new R2();
		B1 r=ob2;
		System.out.println(r.j);
		
	}

}
