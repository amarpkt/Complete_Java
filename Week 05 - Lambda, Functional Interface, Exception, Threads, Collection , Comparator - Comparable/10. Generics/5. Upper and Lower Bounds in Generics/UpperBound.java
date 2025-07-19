import java.util.ArrayList;

public class UpperBound{
    public static void main(String[] args) {

        Human human = new Human();
        Employee employee = new Employee();
        human = employee;  //Allowed as runTime polymorphism is working here 

        ArrayList<Human> humanList= new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();
        //humanList = employeeList; //NOT ALLOWED - As this is not applicable with Generics

        ArrayList<Human> humanList3 = new ArrayList<>();

        ArrayList<?> humanList2= new ArrayList<>();
        humanList2 = employeeList; //Allowed with WildCard
        humanList2 = humanList3;  //Collection with same type also allowed


        //Now lets see the UpperBound concept
        ArrayList<? extends Human> humanList4 = new ArrayList<>();
        humanList4 = employeeList; //Allowed with Wildcard extendig Human class
        humanList4 = humanList3; //Collection with same type also allowed

        ArrayList<Object> objectList = new ArrayList<>();
        // humanList4 = objectList; //Not allowed being as Object class is not child class of Human
        
        ArrayList<String> stringList = new ArrayList<>();
        // humanList4 = stringList; //Not allowed as there is no relation between Human and String class
    }
}

class Human{
}
class Employee extends Human{
}