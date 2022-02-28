package com.array;

public class ReturnArray {
	static int[] createArray(int size) {
		int [] ar=new int[size];
		insert(ar);
		return ar;
	}
	static void insert(int[] ar) {
		for(int i=0;i<ar.length;i++)
			ar[i]=i+1;
	}
	static void display(int ar[]) {
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
	public static void main(String[] args) {
		int[] ar=createArray(5);
		display(ar);
	}

}
