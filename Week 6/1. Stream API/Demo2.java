
import java.util.Arrays;
import java.util.List;

public class Demo2{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,3,2,5,7,6);

        int sum = 0;
        for(int n : nums){
            if(n%2==0){
                System.out.println(n);
                sum = n + sum;
            }
        }
        System.out.println(sum);
    }
}