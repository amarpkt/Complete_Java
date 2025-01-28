import java.util.Set;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(51);
        nums.add(62);
        nums.add(71);
        nums.add(21);
        nums.add(31);
        nums.add(42);
        nums.add(91);
        nums.add(75);
        System.out.println(nums);
    }
}
