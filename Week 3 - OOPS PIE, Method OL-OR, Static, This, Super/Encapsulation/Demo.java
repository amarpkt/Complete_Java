

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        Human obj = new Human();
        obj.age = 11;
        obj.name = "Navin";

        System.out.println(obj.name + " : " + obj.age);


    }
}

class Human{
    //These are the data which we need to bind with methods so that no one can access directly
    String name;
    int age;

}
