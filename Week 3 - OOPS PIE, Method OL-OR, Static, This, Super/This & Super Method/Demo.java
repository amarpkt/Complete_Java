// package Week 3.This & Super Method;

public class Demo {
    public static void main(String[] args) {
        // B obj = new B();
        B obj2 = new B(5);
    }
}

/*
 * when we call object of class B which extends the class A, then as becasue every class has constructor which has a super() 
 * method in it. This constructor of B calls Super() method whose fn is to call constructor of the super class ('A' here).
 * That is why it will print "in A" also. 
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
        super();  //present by default weather you mention or not
        System.out.println("in B");
    }

    public B(int n){
        System.out.println("in B int");
    }
}


