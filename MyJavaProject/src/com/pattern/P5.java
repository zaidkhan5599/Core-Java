package com.pattern;

public class P5 {
	public static void main(String[] args) {
		int star=0;
		int space=4;
		for(int i=0;i<5;i++) {
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star+=2;
			space--;	
		}
//		System.out.println(star);
//		System.out.println(space);
		space+=2;
		star-=3;
		for(int p=0;p<5;p++) {
			for(int r=0;r<space;r++){
				System.out.print(" ");
			}
			for(int q=0;q<star;q++){
				System.out.print("*");
			}
			System.out.println();
			space++;
			star-=2;
		}	
	}
}
