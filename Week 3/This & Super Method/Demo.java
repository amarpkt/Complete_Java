// package Week 3.This & Super Method;

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        // B obj2 = new B(5);
    }
}

class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }

    public B(int n){
        System.out.println("in B int");
    }
}
