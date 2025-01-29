import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo6{
    public static void main(String[] args) {

        Comparator<Student> com = (s1,s2) -> s1.age>s2.age?1:-1 ;  //we don't need to write return as well as there is only one statement.

       List<Student> list = new ArrayList<>();
        list.add(new Student( 21, "Naveen"));
        list.add(new Student( 12, "Jhon"));
        list.add(new Student( 18, "Parul"));
        list.add(new Student( 20, "Kiran"));

        System.out.println(list);
        Collections.sort(list,com);

        for(Student stud : list){
            System.out.println(stud);
        }
    }
}
class Student  {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}