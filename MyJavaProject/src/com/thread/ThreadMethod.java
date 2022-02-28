package com.thread;

public class ThreadMethod extends Thread{

	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println("Name is "+t1.getName());
		System.out.println("Id is "+t1.getId());
		System.out.println("Priority is "+t1.getPriority());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println("name is "+t1.getName());
		System.out.println("Id is "+t1.getId());
		System.out.println("Priority is "+t1.getPriority());
		ThreadMethod tm=new ThreadMethod();
		tm.start();
	}
}
