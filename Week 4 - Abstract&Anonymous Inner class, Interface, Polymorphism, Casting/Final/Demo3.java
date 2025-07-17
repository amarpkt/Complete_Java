// package Complete_Java.Week 4.Polymorphism.Final;

public class Demo3 {
   public static void main(String[] args) {
    System.out.println("begin");
    
    // AdvCalc obj = new AdvCalc();
    // obj.add(3,4);

   } 
}

final class Calc{
    public void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
}

//This extend is not allowed as class Calc is a Final class

// class AdvCalc extends Calc{
    
// }