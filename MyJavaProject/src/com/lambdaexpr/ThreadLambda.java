package com.lambdaexpr;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable r1=()->
		{
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
			}
			
		};
		Thread t=new Thread(r1);
		t.start();
	}

}
