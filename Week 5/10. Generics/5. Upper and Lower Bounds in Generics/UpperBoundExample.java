import java.util.ArrayList;
import java.util.List;
public class UpperBoundExample{
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human();

        Employee employee = new Employee();
        Employee employee2 = new Employee();

        Student student = new Student();

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human);
        humanList.add(human2);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);

        invokeSleep(employeeList); //This one is allowed because of Upper Bound
        invokeSleep(humanList); //This one is also allowed
        // invokeSleep(studentList); //not allowed as there is no relationship between Human and Student class
    }

    public static void invokeSleep(List<? extends Human> list){
        for(Human human : list){
            human.sleep();
        }
    }
}

class Human{
    public void sleep(){
        System.out.println("human need to sleep well");
    }
}
class Employee extends Human{
    public void sleep(){
        System.out.println("employee need to sleep well to stay protective");
    }
}
class Student{
    public void sleep(){
        System.out.println("student need to sleep well as well");
    }
}