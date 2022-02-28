package com.array;

import java.util.Scanner;

public class FirstPrimeNumber {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int flag=1;
		 int k=0;
		 int prim[]=new int[n];
		  for(int i = 3; i < n; i++)
	         {
	             for(int j = 2; j < i; j++)
	             {
	                 if(i % j == 0)
	                 {
	                     flag = 0;
	                     break;
	                 }
	                 else
	                 {
	                     flag = 1;
	                 }
	             }
	             if(flag == 1)
	             {
	                 prim[k]=i;
	                 k++;
	             }
	         }	 
		  for(int i=0;i<prim.length;i++)
		  {
			  if(i==5) {
			  break;
			  }
			  System.out.println(prim[i]);
		  }
	 }
}