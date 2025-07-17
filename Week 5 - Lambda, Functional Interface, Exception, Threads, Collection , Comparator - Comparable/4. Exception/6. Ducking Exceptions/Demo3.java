// package 6. Ducking Exceptions;

public class Demo3 {
   public static void main(String[] args) throws ClassNotFoundException{
    System.out.println("Check class status");
    A obj = new A();
    obj.show();   
   } 
}


class A{
    public void show() throws ClassNotFoundException{
            Class.forName("Calc");
    }
}