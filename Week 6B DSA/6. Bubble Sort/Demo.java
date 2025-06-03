
public class Demo {

    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // 8 6 9 2 4 5
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
            System.out.println();

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
