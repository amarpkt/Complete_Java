// package 1. Multiple Threads;

public class Demo2 {
   public static void main(String[] args) {
        System.out.println("begin");
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
   } 
}

class A implements Runnable {
    public void run(){
            for(int i =1; i<=5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch ( InterruptedException e) {e.printStackTrace();
                }
            }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 1; i <= 5 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch ( InterruptedException e) {e.printStackTrace();
            }
        }
    }
}