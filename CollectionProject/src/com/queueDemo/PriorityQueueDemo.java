package com.queueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.add(90);
		pq.add(78);
		pq.add(null);
		pq.add(78);
		pq.add(56);
		pq.add(56);
		pq.add(98);
		
		pq.add(71);
		
		System.out.println(pq);
		
		pq.offer(71);
		
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.poll());
	}

}
