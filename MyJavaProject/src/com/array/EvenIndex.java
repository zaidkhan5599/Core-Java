//Write a program to create an array of size 5. Insert element inside 
//the array and display the element present at even index.
package com.array;

public class EvenIndex {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=91;
		a[1]=92;
		a[3]=94;
		a[2]=95;
		a[4]=96;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
