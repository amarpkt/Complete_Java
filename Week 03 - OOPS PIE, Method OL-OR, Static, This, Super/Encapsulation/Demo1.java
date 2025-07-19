

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("begin");

        Human obj = new Human();
        //obj.age = 11;
        //obj.name = "Navin";
        //System.out.println(obj.name + " : " + obj.age);

        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}

class Human{
    //These are the data which we need to bind with methods so that no one can access directly
    private String name = "Navin";
    private int age = 11;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}
