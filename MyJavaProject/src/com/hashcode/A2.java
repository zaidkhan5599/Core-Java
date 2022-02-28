package com.hashcode;

public class A2 extends A1{
	boolean f;
	double d;
	String s;
	A2(){
		
	}
	A2(int i,char j,boolean f,double d,String s){
		super(i,j);
		this.f=f;
		this.d=d;
		this.s=s;
	}
	public boolean equals(Object ob) {
		A2 temp=(A2)ob;
		return super.equals(temp) && 
				this.f==f && 
				this.d==d &&
				this.s.equals(temp.s);
	}
	public int hashCode() {
		int hc;
		if(f) {
			hc=1;
		}
		else {
			hc=0;
		}
		hc=hc+(int)d;
		return super.hashCode()+hc+this.s.hashCode();
	}
}
