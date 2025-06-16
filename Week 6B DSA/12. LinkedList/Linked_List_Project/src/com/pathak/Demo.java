package com.pathak;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		//reference to revise ArrayList concept
//		ArrayListRevise.arrayListRevise();
		
		System.out.println("Linked List: ");
		LinkedList nums = new LinkedList();
		nums.add(5);
		nums.add(9);
		
		nums.addFirst(6);
		
		System.out.print("all elements of LinkedList: ");
		System.out.println(nums);
		
		System.out.print("Head Element: ");
		System.out.println(nums.peek());
		
		System.out.print("Value at Index 2: ");
		System.out.println(nums.get(2));
		
		
		
	}
}
