import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(51);
        nums.add(62);
        nums.add(71);
        nums.add(51);
        System.out.println(nums);
    }
}
