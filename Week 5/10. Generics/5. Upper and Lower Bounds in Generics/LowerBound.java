import java.util.ArrayList;

public class LowerBound{
    public static void main(String[] args) {

        //Human class and Employee class collection declaration
        ArrayList<Human> humanList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();

        //Comparing Human class and Employee class collection comparison with only WILD CARD
        ArrayList<?> humanList2= new ArrayList<>();
        humanList2 = employeeList; //Allowed with WildCard
        humanList2 = humanList  ;  //Collection with same type also allowed


        //Comparing Human class and Employee class collection comparison with only WILD CARD and LOWER BOUND
        ArrayList<? super Human> humanList3 = new ArrayList<>();
        // humanList3 = employeeList; //NOTW Allowed with Wildcard with super as Human class (LOWER BOUND in Picture)
        humanList3 = humanList;    //Collection with same type also allowed

        ArrayList<Object> objectList = new ArrayList<>();
        // humanList4 = objectList; //Now it is allowed being as Object class as parent class of Human class
        
        ArrayList<String> stringList = new ArrayList<>();
        // humanList4 = stringList; //Not allowed  here also as there is no relation between Human and String class
    }
}

class Human{
}
class Employee extends Human{
}