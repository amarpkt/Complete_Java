
import java.util.Arrays;
import java.util.List;

public class Demo2{
    public static void main(String[] args) {
        System.out.println("test");
        List<String> names = Arrays.asList("Naveen","Harsh", "Jhon");

        System.out.println(names);

        List<String> uNames = names.stream()
                              .map(String::toUpperCase)  //This is called Method Reference
                              .toList();

        uNames.forEach(i -> System.out.println(i));  //This can be also done using method reference
        uNames.forEach(System.out::println);       
    }
}