import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo3{
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() > s2.length()){
                    return 1;  //Return 1 means it will swap 
                }else{
                    return -1; //Return -1 means it will not swap
                }
            }
        };

        List<String> list = new ArrayList<>();  //Mentioning Integer on right side is optional post Java 1.7 release
        list.add("amar");
        list.add("pathak");
        list.add("and");
        list.add("Weather");
        System.out.println("Unsorted List of names \n" + list);  //Unsorted list 

        Collections.sort(list,com); //Sorting for unit digit for each number
        System.out.println("\nSorted names List as per String length \n" +list);
    }
}