// package Week 3.Anonymous Object;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("begin");

        new A();

        new A().show();
    }
    
}

class A{

    public A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("In A Show");
    }
}
