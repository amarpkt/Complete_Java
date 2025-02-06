
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        //Approach 1 to add values in List
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);

        //Approach 2 to add values in List
        List<Integer> nums2 = Arrays.asList(1,3,5,7);

        // System.out.println(nums);
        // System.out.println(nums2);

        //Approach 1 to Print all values
        for(int i = 0; i < nums2.size() ; i++){
            System.out.println(nums2.get(i));
        }

        System.out.println();
        //Approach 2 to Print all values
        for(int n : nums2){
            System.out.println(n);
        }

        System.out.println();
        //Appproach 3 to print all values
        nums2.forEach(n ->  System.out.println(n));
    }
}