package insertion_Sort_project;

public class Demo {
	public static void main(String[] args) {
		int nums[] = {5,6,2,3,1};
		System.out.println("Before Sorting: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println();
		InsertionSortLogic.insertionSort(nums);
		
		System.out.println();
		System.out.println("After Sorting: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	
}
