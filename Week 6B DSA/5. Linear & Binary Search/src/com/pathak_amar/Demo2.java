package com.pathak_amar;

public class Demo2 {

	public static int binarySearchWithRecursion(int nums[], int target, int left, int right) {
		if(left <= right) {
			int mid = (left+right)/2;
			if(target == nums[mid]) {
				return mid;
			}else if(target < nums[mid]){
				return binarySearchWithRecursion(nums, target, left, mid-1);
			}else {
				return binarySearchWithRecursion(nums, target, mid+1, right);
			}
		}
		return -1;
	}
}
