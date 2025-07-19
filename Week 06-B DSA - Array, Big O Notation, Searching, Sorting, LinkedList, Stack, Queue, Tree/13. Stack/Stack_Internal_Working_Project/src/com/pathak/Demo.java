package com.pathak;

public class Demo {
	public static void main(String[] args) {
		Stack nums = new Stack();
		nums.push(10);
		nums.push(30);
		System.out.println("Remove this top element : " + nums.pop());
		nums.push(70);
		nums.push(20);
		System.out.println("Fetch present top element : " + nums.peak());
		nums.push(50);
		nums.push(90);
		
		nums.printStack();
	}
}
