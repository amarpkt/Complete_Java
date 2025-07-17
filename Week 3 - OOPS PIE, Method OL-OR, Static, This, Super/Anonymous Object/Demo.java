// package Week 3.Anonymous Object;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begins");
        A obj = new A();
        obj.show();
    }

}

class A{
    public A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("In A Show");
    }
}
