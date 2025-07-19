import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rohan");
        Student s2 = new Student(2, "Rohit");
        
        Employee e1 = new Employee(3, "Roshan");
        Employee e2 = new Employee(4, "Reshham");

        //Without Generics - this will give warning
        ArrayList list = new ArrayList();
        list.add(s1); 
        list.add(s2); 
        list.add(e1); 
        list.add(e2);

        //With geenrics use - we've made it Type safe for Student object
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1); 
        list1.add(s2); 
        
        for(Student st : list1){
            System.out.println(st.id + " : " + st.name);
        }

        //With Generics use - we've made it Type safe for Employee object
        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(e1); 
        list2.add(e2); 
        
        for(Employee ep : list2){
            System.out.println(ep.id + " : " + ep.name);
        }
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