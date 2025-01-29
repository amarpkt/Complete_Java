import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo2{
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;  //Return 1 means it will swap 
                }else{
                    return -1; //Return -1 means it will not swap
                }
            }
        };

        List<Integer> list = new ArrayList<>();  //Mentioning Integer on right side is optional post Java 1.7 release
        list.add(43);
        list.add(31);
        list.add(72);
        list.add(29);
        System.out.println("Unsorted List \n" + list);  //Unsorted list 

        Collections.sort(list);  //Sorting whole number
        System.out.println("\nSorted List with whole number \n" + list);

        Collections.sort(list,com); //Sorting for unit digit for each number
        System.out.println("\nSorted List with unit digit only \n" +list);
    }
}