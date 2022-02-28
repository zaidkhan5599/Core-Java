//Final with local variable
package com.Final;

public class P1 {
	final int i;//cte initialize during declaration.
	final static int j;
	public static void main(String[] args) {
		//final int i=10;
		System.out.println(i++);//cte canot reassign different value
//		i=10;//cte cannot reassign
		P1 ob=new P1();
		ob.i=10;
		System.out.println(ob.i);
		j=90;
	
	}

}
