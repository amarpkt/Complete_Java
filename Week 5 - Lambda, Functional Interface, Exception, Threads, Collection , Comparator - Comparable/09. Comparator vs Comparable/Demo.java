import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();  //Mentioning Integer on right side is optional post Java 1.7 release
        list.add(43);
        list.add(31);
        list.add(72);
        list.add(29);
        System.out.println(list);  //Unsorted list 
        Collections.sort(list);    //sorting using sort() method of Collections class
        System.out.println(list);  //soretd list
    }
}