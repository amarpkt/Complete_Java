
import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;
    transient private int age;

    public Student(int id, String name, int age) {
        super();
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public void disp(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

}