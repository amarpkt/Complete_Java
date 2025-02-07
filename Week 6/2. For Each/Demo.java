import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,3,2,5,7);
        Consumer<Integer> con = new Consumer<>(){
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        nums.forEach(con);
        nums.forEach(n -> System.err.println(n));
    }
}