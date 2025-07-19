import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo4{
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if(s1.age > s2.age ){
                    return 1;  //Return 1 means it will swap 
                }else{
                    return -1; //Return -1 means it will not swap
                }
            }
        };

        List<Student> list = new ArrayList<>();
        list.add(new Student( 21, "Naveen"));
        list.add(new Student( 12, "Jhon"));
        list.add(new Student( 18, "Parul"));
        list.add(new Student( 20, "Kiran"));

        System.out.println(list);
        Collections.sort(list, com);

        for(Student stud : list){
            System.out.println(stud);
        }

    }
}
class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}