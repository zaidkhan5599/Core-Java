package com.basic;

import java.util.Scanner;

public class Paneer {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner (System.in);
		char ans;
		String [] s= {"paneer masala","paneer pakoda","paneer ","dosa paneer","uttapamm","idli","vada","Mendu","kadai"};
		char ch[] =new char[100];
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		do {
		System.out.println("Enter the character you want to search for the list ?");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<s.length;i++) {
			for(int l=0;l<s[i].length();l++) {
				ch[l]=s[i].charAt(l);
				if(ch[l]==ch1) {
					System.out.println(s[i]);
				}
			}
		
		}
		System.out.println("Do ypu want to still search for next letter type 'y' or 'Y'");
		System.out.println("presss any key to exit"); 
		ans=sc.next().charAt(0);
		}while(ans=='y'||ans=='Y');

}
}
