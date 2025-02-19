
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo{
    public static void main(String[] args) {
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random(); //this will be used to generate random number
        for(int i = 1; i<= size; i++ ){
            nums.add(ran.nextInt(100)); //this will be used to add the random numbers in list nums
        }

        // System.out.println(nums);
        
        int sum = nums.stream()
                    .map(i -> i*2)
                    .reduce(0, (c,e) -> c+e);
        System.out.println(sum);



        int sum2 = nums.stream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        System.out.println(sum2);

        int sum3 = nums.parallelStream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        System.out.println(sum3);


    }
}