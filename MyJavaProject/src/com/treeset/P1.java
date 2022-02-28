package com.treeset;

public class P1 implements Comparable<P1>{
	int i;
	P1(){
		
	}
	P1(int i){
		this.i=i;
	}
	public int compareTo(P1 o) {
		return this.i-o.i;
	}
	public String toString() {
		return ""+i;
	}
	

}
