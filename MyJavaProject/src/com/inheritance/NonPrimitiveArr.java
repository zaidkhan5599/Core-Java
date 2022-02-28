package com.inheritance;

import java.util.Scanner;

public class NonPrimitiveArr {
	
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of employee");
		int n=sc.nextInt();
		Employee e=new Employee();
		Employee e1[]=e.accept(n);
		e.display(e1);
		
	}

}
