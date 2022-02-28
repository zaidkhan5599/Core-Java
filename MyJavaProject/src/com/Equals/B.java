package com.Equals;

public class B {
	int i;
	B(){
		
	}

	B(int i){
		this.i=i;
	}
	public boolean equals(Object ob) {
		B ob1=(B)ob;
		return this.i==ob1.i;
	}
	
}
