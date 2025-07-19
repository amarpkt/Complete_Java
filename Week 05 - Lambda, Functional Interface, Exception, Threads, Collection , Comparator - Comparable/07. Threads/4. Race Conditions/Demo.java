public class Demo {
   public static void main(String[] args) {
        System.out.println("Lambda Exp");
        Runnable obj1 = () -> {
                for(int i =1; i<=5; i++){
                   
                }
            }
        ;
        Runnable obj2 = () -> {
                for(int i = 1; i <= 5 ; i++){
                   
                }
            }
        ; 
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
   } 
}