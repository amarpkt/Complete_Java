// package Complete_Java.Week 4.Polymorphism.Final;



//USE CASE for final class
public class Demo4 {
    public static void main(String[] args) {
    
     AdvCalc obj = new AdvCalc();
     obj.owner();
 
    } 
 }
 
 final class Calc{
     public void owner(){
         System.out.println("By Amar");
     }
 }
 
class AdvCalc { //extends Calc{  //final claass does not allow class inheritance
    public void owner(){
        System.out.println("B Naveen");
    }
    
}