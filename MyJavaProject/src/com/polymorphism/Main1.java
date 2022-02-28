package com.polymorphism;

public class Main1 {

	public static void main(String[] args) {
		A ob[]=new A[4];
		ob[0]=new A();
		ob[1]=new B();
		ob[2]=new B();
		ob[3]=new A();
		for(int i=0;i<ob.length;i++)
		{
			ob[i].test();
			if(ob[i] instanceof B)
				((B)ob[i]).test();
				System.out.println("+++++++++++");
		}
	}

}
