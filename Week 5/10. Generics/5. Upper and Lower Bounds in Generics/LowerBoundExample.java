import java.util.ArrayList;
import java.util.List;
public class LowerBoundExample{
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human();

        Employee employee = new Employee();
        Employee employee2 = new Employee();

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human);
        humanList.add(human2);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);

        // invokeSleep(employeeList); //This one is not allowed because of lower Bound in place
        invokeSleep(humanList); //This one is also allowed
    }

    public static void invokeSleep(List<? super Human> list){
        for(Object human : list){
            
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