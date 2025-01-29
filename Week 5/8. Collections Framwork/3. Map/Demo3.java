
import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Navin", 93);
        students.put("Kiran", 95);
        students.put("Amar", 99);
        students.put("Aman", 90);
        students.put("Kiran", 65);

        System.out.println(students.keySet());  //Print all Keys of Map students

        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }

        //OR for more relatable to Map, we can replace name by word KEY

        for(String key : students.keySet()){
            System.out.println(key  + " : " + students.get(key));
        }


    }
}
