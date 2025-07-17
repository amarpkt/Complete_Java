// package Complete_Java.Week 4.Polymorphism.Final;

public class Demo2 {
    public static void main(String[] args) {
    
        AdvCalc obj = new AdvCalc();
        obj.owner();
        obj.show();
    
       } 
    }
    
    class Calc{
        public final void owner(){
            System.out.println("By Amar");
        }
        public void show(){
            System.out.println("in calc show");
        }
    }
    
   class AdvCalc extends Calc{

        // Method overriding not allowed for final method owner()
       //public void owner(){
       //    System.out.println("B Naveen");
       //}
       
   }