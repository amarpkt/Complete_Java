
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Map{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        System.out.println(nums);

        Function<Integer, Integer> f = new Function<Integer, Integer>(){
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        int result = nums.stream()
                     .filter(n -> n%2==0)  //See Filter.java for explanation
                     .map(f)
                     . reduce(0,(c,e) -> c+e);

        System.out.println(result); 
    }
}