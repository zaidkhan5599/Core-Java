package com.collection;

import java.util.PriorityQueue;

public class QueueP {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(2);
		queue.add(5);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		
		while(queue.isEmpty()!=true) {
			System.out.println(queue.poll());
		}
		System.out.println("size : "+queue.size());
		
		
		
	}

}
