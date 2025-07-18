import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5{
    public static void main(String[] args) {

       List<Student> list = new ArrayList<>();
        list.add(new Student( 21, "Naveen"));
        list.add(new Student( 12, "Jhon"));
        list.add(new Student( 18, "Parul"));
        list.add(new Student( 20, "Kiran"));

        System.out.println(list);
        Collections.sort(list);

        for(Student stud : list){
            System.out.println(stud);
        }
    }
}
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if(this.age > that.age ){
            return 1;  //Return 1 means it will swap 
        }else{
            return -1; //Return -1 means it will not swap
        }
    }
}