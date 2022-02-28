package com.Equals;

public class C {
	int i;
	char j;
	String k;
	C(){
		
	}
	C(int i,char j,String k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public String toString() {
		return "i: " +i+" j: "+j+" k :"+k;
	}
	public boolean equals(Object ob) {
		C temp=(C)ob;
		return this.i==temp.i && this.j==temp.j && this.k.equals(temp.k);
	}

}
