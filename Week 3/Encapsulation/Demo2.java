

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("begin");

        Human obj = new Human();
       

        obj.setAge(11);
        obj.setName("navin");
        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}

class Human{
    //These are the data which we need to bind with methods so that no one can access directly
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }


    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
