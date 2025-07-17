
import java.util.Arrays;
import java.util.List;



public class Demo{
    public static void main(String[] args) {
        // System.out.println("Test");
        List<String> names = Arrays.asList("Naveen", "Jhon", "Lakshmi", "Kishor");

        // System.out.println(names);

        String name = names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst()
                        .orElse("Not foundd");
                        
        System.out.println(name);
        // System.out.println(name.orElse("not found"));
        
        


    }
}