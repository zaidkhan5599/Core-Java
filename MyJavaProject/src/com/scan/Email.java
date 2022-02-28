package com.scan;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		String email;
		System.out.println("Enter Name\n ");
		name=sc.next();
		System.out.println("Enter email \n");
		email=sc.next();
		System.out.println("Name is "+name+"and email is "+email);
		System.out.println("Enter email and name \n");
		String ne=sc.next();
		System.out.println(ne);
		
	}

}
