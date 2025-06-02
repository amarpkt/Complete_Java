package com.pathakAmar;

public class Demo {
	public static void main(String[] args) {
		int nums[] = {5,7,9,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,33,43,53,63,73,83,94};
		int target = 53;

		int result1 = linearSearch(nums,target);
		int result2 = binarySearch(nums,target);
		if (result1!= -1) {
			System.out.println("Element found at index: " + result1);
		}
		else {
			System.out.println("Element not found");
		}
		if (result2!= -1) {
			System.out.println("Element found at index: " + result2);
		}
		else {
			System.out.println("Element not found");
		}

	}

	private static int linearSearch(int[] nums, int target) {
		int steps = 0;
		for(int i=0; i <nums.length ; i++) {
			steps++;
			if (nums[i] == target){
				System.out.println("Number of Steps taken by linear search: " + steps);
				return i;
			}
		}
		System.out.println("Number of Steps taken by linear search: " + steps);
		return -1;
	}
	private static int binarySearch(int[] nums, int target) {
		//5,7,9,11,13
		int left = 0;
		int right = nums.length -1;
		int steps = 0;
		while(left <= right) {
			steps++;
			int mid = (left + right)/2;
			if(nums[mid] ==target) {
				System.out.println("Number of steps taken by Binary Search: " + steps);
				return mid;
			}else if (nums[mid] < target ) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		System.out.println("Number of Steps taken by Binary search: " + steps);
		return -1;
	}
	
}
