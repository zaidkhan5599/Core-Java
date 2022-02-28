//Write a program to display a method to check whether
//given number is prime number.
package com.method;

public class PrimeNumber {

	static void isPrime(int n) {
		int flag=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime ");
				flag=1;
				break;
			}
				
		}
		if(flag==0)
		System.out.println(n+" is prime ");
		
	}
	public static void main(String[] args) {

		int n=9;
		isPrime(n);
	}

}
