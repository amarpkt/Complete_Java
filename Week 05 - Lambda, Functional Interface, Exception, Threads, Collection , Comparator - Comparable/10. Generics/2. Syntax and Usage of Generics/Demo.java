
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        
        //ArrayList - now it's Type Safe
        ArrayList<String> list = new ArrayList<>();
        list.add("Rohit2");
        list.add("Rohan2");
        list.add("Ramesh2");
        // list.add(10);  //Not allowed now

        String name1 = list.get(0);
        System.out.println(name1);
        String name2 = list.get(2);  
        System.out.println(name2);
        

    }
}
