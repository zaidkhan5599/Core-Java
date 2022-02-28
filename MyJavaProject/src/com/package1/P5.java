package com.package1;

public class P5 extends P4{//default constructor of P5() is trying to invoke P4().
P5(){
	super(10);
}
	public static void main(String[] args) {
		P4 p=new P4(10);//P4 is not visible.
		P4 p1=new P4();
}

}
