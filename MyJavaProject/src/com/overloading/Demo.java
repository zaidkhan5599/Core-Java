//1)WAP to show method overloading.
package com.overloading;

public class Demo {

	static void add(int x,int y) {
		System.out.println("Addition of two number is :"+(x+y));
	}
static void add(int x,int y,int z) {
		System.out.println("Addition of three nos are :"+(x+y+z));
	}
static void add(int x,int y,int z,int a) {
	System.out.println("Addition of four nos. are :"+(x+y+z+a));
}
	public static void main(String[] args) {
		add(4,6);
		add(98,99,112);
		add(434,232,6);
	}

}
