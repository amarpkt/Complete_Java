public class Demo {
    public static void main(String[] args) {
        int nums[] = {3, 7, 2, 4};

        System.out.println(nums[1]);

        nums[1] = 6;

        System.out.println(nums[1]);

        // Printing all values without sysout i.e. using loop
        for(int i = 0 ; i < 4 ; i++){
            System.out.print(nums[i] + " ");
        }
    }    
}