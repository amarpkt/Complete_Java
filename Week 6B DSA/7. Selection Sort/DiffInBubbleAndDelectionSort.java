
public class DiffInBubbleAndDelectionSort {

    public static void main(String[] args) {
        System.out.println("Tets");
        int nums[] = {6, 5, 2, 8, 9, 4};
        System.out.println("");
        int temp = 0;
        int size = nums.length;

        System.out.println("Before Bubble Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        bubbleSortLogic(nums, temp, size);

        System.out.println("After Bubble Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }


        int nums2[] = {6, 5, 2, 8, 9, 4};
        System.out.println("");
        int temp2 = 0;
        int minIndex = 0;
        int size2 = nums.length;

        System.out.println("\n\nBefore Selection Sorting: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        
        selectionSortLogic(nums2, temp2, size2, minIndex);

        System.out.println("After Selection Sorting: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSortLogic(int nums[], int temp, int size) {
        //{6, 5, 2, 8, 9, 4};
        System.out.println("\nInside Bubble Sort Logic:");
        int count = 0;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    count++;

                    for (int num : nums) {
                        System.out.print(num + " ");
                    }
                    System.out.println(" ");
                }
            }
        }
        System.out.println("Number of Swaps in Bubble Sort: " + count);
    }

    public static void selectionSortLogic(int nums[], int temp, int size, int minIndex) {
        //{6, 5, 2, 8, 9, 4};
        System.out.println("\nInside Selection Sort Logic:");
        int count = 0;
        for (int i = minIndex; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
            count++;

            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Number of Swaps in Selection Sort: " + count);
    }
}
