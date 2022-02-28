package com.Equals;

public class L1 extends C{
	double l;

	public L1() {
		super();
	
	}

	public L1(int i, char j, String k,double l) {
		super(i, j, k);
		this.l=l;
	}
	public boolean equals(Object ob) {
		L1 temp=(L1)ob;
		return super.equals(temp) && this.l==temp.l;
	}

	@Override
	public String toString() {
		return super.toString()+" l: "+l;
	}
	
	

}
