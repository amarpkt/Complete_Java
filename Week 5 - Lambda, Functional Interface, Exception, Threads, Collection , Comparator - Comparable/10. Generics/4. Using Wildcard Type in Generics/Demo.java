
import java.util.ArrayList;

public class Demo{
    public static void main(String[] args) {

        Human human = new Human();
        Employee employee = new Employee();

        human = employee; //human is parent and Employee is child 
        // employee = human; //not Allowed 

        ArrayList<Human> humanList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();

        //humanList = employeeList; //This is not allowed when Generics are involved

        ArrayList<Human> humanList2 = new ArrayList<>();
        humanList = humanList2;  // This one is allowed.




        
    }
}

class Human{

}

class Employee extends Human{

}