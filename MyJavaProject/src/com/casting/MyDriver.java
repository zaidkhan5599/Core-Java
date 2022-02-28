//Write a program to show upcasting.
package com.casting;

public class MyDriver {

	public static void main(String[] args) {
		B ob=new C();//Upcasting
		System.out.println(ob.i);
		System.out.println(ob.j);
		//System.out.println(ob.k);//CTE
		A ob1=new C();
		System.out.println(ob1.i);
//		System.out.println(ob1.j);//cte
//		System.out.println(ob1.k);//cte
		A ob3=new B();
		System.out.println(ob3.i);
//		System.out.println(ob3.j);//cte
		A ob4=ob;
		System.out.println(ob4.i);
	}

}
