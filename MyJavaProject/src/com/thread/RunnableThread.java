package com.thread;

public class RunnableThread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		RunnableThread r= new RunnableThread();
		Thread t1 =new Thread(r);
		t1.start();
	}

}
