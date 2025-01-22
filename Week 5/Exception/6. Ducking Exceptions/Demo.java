// package 6. Ducking Exceptions;

public class Demo {
   public static void main(String[] args) {
    System.out.println("Check class status");
    A obj = new A();
    obj.show();
   } 
}


class A{
    public void show(){
        try{
            Class.forName("Calc");
        }
        catch(ClassNotFoundException e){
            System.out.println(e + ", class not found");
        }
    }
}