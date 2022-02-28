package com.basic;

public class Vowel {

	public static void main(String[] args) {
		char ch='e';
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
			default:System.out.println("Not a vowel");
			break;
		}
	}

}
