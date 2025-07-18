// package 1. Multiple Threads;

public class Demo4 {
   public static void main(String[] args) {
        System.out.println("Lambda Exp");
        Runnable obj1 = () -> {
                for(int i =1; i<=5; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch ( InterruptedException e) {e.printStackTrace();
                    }
                }
            }
        ;
        Runnable obj2 = () -> {
                for(int i = 1; i <= 5 ; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch ( InterruptedException e) {e.printStackTrace();
                    }
                }
            }
        ; 
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
   } 
}