package com.hashcode;

public class A1 {
	int i;
	char j;
	A1(){
		
	}
	@Override
	public int hashCode() {
		int hc=i+j;
		return hc;
	}
	@Override
	public boolean equals(Object obj) {
		A1 temp=(A1)obj;
		return this.i==temp.i;
	}
	
	public A1(int i, char j) {
		this.i = i;
		this.j = j;
	}
	

}
