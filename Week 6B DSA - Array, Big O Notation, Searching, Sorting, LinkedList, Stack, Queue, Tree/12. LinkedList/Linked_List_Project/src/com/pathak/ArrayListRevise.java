package com.pathak;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListRevise {
	public static void arrayListRevise() {
		Collection nums = new ArrayList();
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		System.out.println("Printing all objects of nums as an array");
		System.out.println(nums);
		//for(int n : nums){
		//	System.out.print(n + " ");
		//}
		System.out.println();
		System.out.println("Printing all objects individually");
		for(Object n : nums){
			System.out.print(n + " ");
		}
	}
}
