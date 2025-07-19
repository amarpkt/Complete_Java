package com.pathak;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Linked List: ");
		LinkedList nums = new LinkedList();
		nums.add(5);
		nums.add(9);
		nums.add(6);
		
		nums.printValues();
		
		nums.addFirst(4);
		nums.printValues();
		
		nums.delete(9);
		nums.printValues();
	}
}
