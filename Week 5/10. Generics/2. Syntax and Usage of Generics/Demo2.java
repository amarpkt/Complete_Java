import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rohan");
        Student s2 = new Student(2, "Rohit");
        
        Employee e1 = new Employee(1, "Roshan");
        Employee e2 = new Employee(1, "Reshham");


        ArrayList list = new ArrayList();
        list.add(s1); 
        list.add(s2); 
        list.add(e1); 
        list.add(e2); 

    }
}
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}