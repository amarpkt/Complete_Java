import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(51);
        nums.add(62);
        nums.add(71);
        nums.add(21);

        Iterator<Integer>  values = nums.iterator();
        //now values stores all the elements using iterator

        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
