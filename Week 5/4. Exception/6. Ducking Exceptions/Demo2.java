// package 6. Ducking Exceptions;

public class Demo2 {
   public static void main(String[] args) {
    System.out.println("Check class status");
    A obj = new A();
        try {
            obj.show();   
        } catch (ClassNotFoundException e) {
            System.out.println("checking class found status");
            System.out.println(e + ", class not found");
        }
   } 
}


class A{
    public void show() throws ClassNotFoundException{
            Class.forName("Calc");
    }
}