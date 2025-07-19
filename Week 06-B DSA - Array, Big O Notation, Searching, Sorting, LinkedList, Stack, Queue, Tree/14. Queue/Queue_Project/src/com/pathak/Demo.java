package com.pathak;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Alice");
		queue.add("Bob");
		queue.add("Charlie");
		
		System.out.println("Initial Queue: " + queue);
		System.out.println("Peeking top : " + queue.peek());
		System.out.println("Removing Top: " + queue.poll());
		System.out.println("Post removal : " + queue);
		System.out.println("Is Queue Empty: " + queue.isEmpty());
		System.out.println("Current Size: "  + queue.size());
	}
}
