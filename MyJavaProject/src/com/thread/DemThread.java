package com.thread;

public class DemThread extends Thread{

	public void run() {
		//Thread.currentThread().yield();
		for(int i=0;i<10;i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName()+" in control");
			}
		
	}
		
	public static void main(String[] args) throws InterruptedException {
		DemThread d=new DemThread();

		d.start();
		
		for(int j=0;j<10;j++) {
			d.join();
			System.out.println(Thread.currentThread().getName()+" in control");
		}
		
		
	}

}
