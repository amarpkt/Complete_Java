// package 1. Multiple Threads;

public class Demo {
   public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
   } 
}

class A extends  Thread{
    public void run(){
            for(int i =1; i<=100; i++){
                System.out.println("Hi");
            }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i <= 100 ; i++){
            System.out.println("Hello");
        }
    }
}