package com.ToString;

public class P2 extends P1{
String l1;

public P2(int i,char j,double k,String l1) {
	super(i,j,k);
	this.l1 = l1;
}

@Override
public String toString() {
	return super.toString()+" l:"+l1;
}
public static void main(String[] args) {
	P1 ob=new P1(10,'a',3.4);
	System.out.println(ob);
	P2 ob2=new P2(20,'1',2.0,"hi");
	System.out.println(ob2);
}

}
