package com.pattern;

public class P4 {

	public static void main(String[] args) {
		int space=0;
		int star =4;
		for(int i=0;i<5;i++) {
			for(int j=0;j<space;j++) {
			System.out.print(" ");
			}	
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
		System.out.println();
		star--;
		space++;
	}
	}

}
