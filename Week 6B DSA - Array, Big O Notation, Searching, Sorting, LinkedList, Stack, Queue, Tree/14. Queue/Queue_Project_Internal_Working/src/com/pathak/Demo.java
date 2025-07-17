package com.pathak;

public class Demo {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.show();
		System.out.println("removed element : " + queue.dequeue());
		queue.show();
		//queue.enqueue(50); //Here it fails, Array Index out of Bound Exception
		
		System.out.println("\nCircular Queue");
		//Circular Queue
		CQueue cq = new CQueue();
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.show();
		System.out.println("removed element : " + cq.dequeue());
		cq.show();
		cq.enqueue(50);
		cq.show();
		
		
		
		
		
		
	}
}
