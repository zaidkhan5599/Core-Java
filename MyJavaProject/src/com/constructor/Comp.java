package com.constructor;

import java.util.Scanner;

public class Comp {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Emp[] e=new Emp[5];
		System.out.println("Enter number of employee");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		e[i]=new Emp();
		System.out.println("Enter name ");
		String nm=sc.next();
		e[i].setName(nm);
		System.out.println("Enter the salary");
		double sal=sc.nextDouble();
		e[i].setSal(sal);

		}
		for(int i=0;i<n;i++)
		System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].sal);	
	}

}
