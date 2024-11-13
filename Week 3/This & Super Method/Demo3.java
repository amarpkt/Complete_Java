// package Week 3.This & Super Method;

public class Demo3 {
    public static void main(String[] args) {
        B obj2 = new B(5);
    }
}

/*
 * Here isn this example we have removed all super() method and have kpet only one this() method.
 * this() method calls the DEFAULT constructor of same class
 */

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
        /*when this constructor of class B is called it internally calls super and which calls in A */
        System.out.println("in B");
    }

    public B(int n){
        this();
        /* here this() method will call the default constructor of class B */
        
        System.out.println("in B int");
    }
}
