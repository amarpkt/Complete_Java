package com.pathak;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack nums = new Stack();
		nums.push(10);
		nums.push(30);
		System.out.print("value popped: ");
		System.out.println(nums.pop());
		nums.push(70);
		nums.push(20);
		
		System.out.println(nums);
		

	}
}
