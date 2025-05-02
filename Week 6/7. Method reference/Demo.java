
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        System.out.println("test");
        List<String> names = Arrays.asList("Naveen","Harsh", "Jhon");

        System.out.println(names);

        List<String> uNames = names.stream()
                              .map(name -> name.toUpperCase())
                              .toList();
        System.out.println(uNames);                              

    }
}