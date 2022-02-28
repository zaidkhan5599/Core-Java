package com.hashcode;

public class B {
	int i;

	public B() {
	}

	public B(int i) {
		this.i = i;
	}
	public boolean equals(Object ob) {
		return this.i==((B)ob).i;
	}
	public int hashCode() {
		return  i;
	}
}
