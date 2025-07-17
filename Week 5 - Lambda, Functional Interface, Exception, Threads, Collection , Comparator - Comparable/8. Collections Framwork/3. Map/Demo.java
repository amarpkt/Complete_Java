
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Navin", 93);
        students.put("Kiran", 95);
        students.put("Amar", 99);
        students.put("Aman", 90);

        System.out.println(students);  //Print all students 
        System.out.println( students.get("Amar")); //Prints value of the key whose name is written here.
    }
}
