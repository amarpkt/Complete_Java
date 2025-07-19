// package Week 3.Constructor;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        Human obj = new Human();
        //Before assigning values to object variables
        System.out.println(obj.getName() + " : "  + obj.getAge());

        obj.setAge(30);
        obj.setName("navin");

        //Before assigning values to object variables
        // System.out.println(obj.getName() + " : "  + obj.getAge());



    }
}

class Human{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}