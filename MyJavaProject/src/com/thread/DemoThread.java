//Write a program to create a new Thread.
package com.thread;

public class DemoThread extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		DemoThread d=new DemoThread();
		System.out.println(Thread.currentThread().getName());
		d.start();
	}

}
