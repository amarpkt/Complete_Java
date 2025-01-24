// package 1. Multiple Threads;

public class Demo {
   public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.show();
        obj2.show();
   } 
}

class A{
    public void show(){
            for(int i =1; i<=10; i++){
                System.out.println("Hi");
            }
    }
}

class B{
    public void show(){
        for(int i = 1; i <= 10 ; i++){
            System.out.println("Hello");
        }
    }
}