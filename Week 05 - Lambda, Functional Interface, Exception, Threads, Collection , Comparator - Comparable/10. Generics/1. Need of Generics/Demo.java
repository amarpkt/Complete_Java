
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        
        //Array - Type Safe
        String names[] = new String[4]; //Defining String array with 5 length
        names[0] = "Rohit1";
        names[1] = "Rohan1";
        names[2] = "Ramesh1";
        names[3] = "Ritesh1";

        String name1 = names[0];  //Assigning name1 variable a value from String array - 0th Index value.
        String name2 = names[1];
        // int nameX = names[2]; // Can not be used with a type safe Array structure
        System.out.println(name1);
        System.out.println(name2);

        


        //ArrayList - NonType Safe
        ArrayList list = new ArrayList();
        list.add("Rohit2");
        list.add("Rohan2");
        list.add("Ramesh2");
        list.add(10);

        String name3 = (String) list.get(0);
        System.out.println(name3);
        String name4 = (String) list.get(3);  //This is allowed because of ArrayList being non typesafe
        System.out.println(name4);
        
        


        //ALTERNATIVES
        //If we already know that the value is not String (which we don't know for now), then this way we can use.
        // int num = (Integer) list.get(3);  // Correct way to retrieve an Integer
        // System.out.println(num);

        //If it would have been list.add("10"); --> 10 as String
        //int parsedNum = Integer.parseInt((String) list.get(3));
        //System.out.println(parsedNum);

    }
}
