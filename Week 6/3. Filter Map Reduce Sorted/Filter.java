import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        System.out.println(nums);

        Predicate<Integer> p = new Predicate<>(){
            public boolean test(Integer n) {
                if(n % 2 == 0){
                    return true;
                }else 
                    return false;
            }
        };

        Predicate<Integer> p2 = n -> n % 2 == 0;

        int result = nums.stream()
                     .filter(p2)
                     .map(n -> n*2)
                     . reduce(0,(c,e) -> c+e);

        System.out.println(result); 
    }
}