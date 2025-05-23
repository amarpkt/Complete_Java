
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naveen", "Jhon", "Laxmi");

        List<Student> students = new ArrayList<>();


        // for(String name : names){
        //      students.add(new Student(name));
        // }

        // students = names.stream()
        //             .map(name -> new Student(name))
        //             .toList();

        students = names.stream()
                .map(Student::new)
                .toList();

        System.out.println(students);

    }
}

class Student{
    String name;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}