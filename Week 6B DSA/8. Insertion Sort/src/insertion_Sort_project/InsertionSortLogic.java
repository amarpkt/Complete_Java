package insertion_Sort_project;

public class InsertionSortLogic {
	public static void insertionSort(int nums[]) {
		System.out.println("Inside Insertion Sort logic: ");
		int size = nums.length;
		//{5,6,2,3,1};
		for(int i = 1 ; i < size ; i++) {
			int key = nums[i];
			int j = i-1;
			while(j >= 0 && nums[j] > key ) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
			System.out.print("After Iteration number " + i + " when key element was " + key+ ": ");
			
			for(int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println(" ");
			System.out.println("here we can see that the key element " + key + " is at it's right position as per current iteration");
		}
	}
}
