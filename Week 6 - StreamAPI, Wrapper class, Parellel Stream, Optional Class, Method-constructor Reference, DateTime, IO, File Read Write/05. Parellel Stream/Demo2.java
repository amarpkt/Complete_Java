
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random(); //this will be used to generate random number
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100)); //this will be used to add the random numbers in list nums
        }

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        long endSeq = System.currentTimeMillis();

        long startParaSeq = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        long endParaSeq = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("ParaSeq: " + (endParaSeq - startParaSeq));

    }
}
