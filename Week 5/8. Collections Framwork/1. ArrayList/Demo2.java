import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        // Collection nums = new ArrayList();
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        System.out.println(nums);

        for(int n : nums){
            System.out.print(n + " ");
        }

        System.out.println();
        
        for(Object n : nums){
            System.out.print(n + " ");
        }
            



    }
}
