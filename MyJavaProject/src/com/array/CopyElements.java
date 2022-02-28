//Write a program to create two arrays, copy the elements of 
//one array inside another array.
package com.array;

public class CopyElements {

	public static void main(String[] args) {
		int a[]= new int[5];
		int b[] = {20,304,404,450};
		for(int i=0;i<b.length;i++) {
			a[i]=b[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
