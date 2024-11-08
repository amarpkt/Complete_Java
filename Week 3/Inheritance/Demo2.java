// package Week 3.Inheritance;

public class Demo {
   public static void main(String[] args) {
    System.out.println("begin");

    Calc obj = new Calc();
    int r1 = obj.add(4, 5 );
    int r2 = obj.sub(7,3);

    System.out.println(r1 + " : " + r2);

    AdvCalc obj2 = new AdvCalc();
    int r3 = obj2.add(4,5);
    int r4 = obj2.sub(7, 3);
    int r5 = obj2.mul(3, 5);
    int r6 = obj2.div(15, 3);

    System.out.println(r3 + " " + r4 + " " +  r5 + " " + r6);

    VeryAdvCalc obj3 = new VeryAdvCalc();
    int r7 = obj3.add(4,5);
    int r8 = obj3.sub(7, 3);
    int r9 = obj3.mul(3, 5);
    int r10 = obj3.div(15, 3);
    double r11 = obj3.power(2, 4);

    System.out.println(r7 + " " + r8 + " " +  r9 + " " + r10 + " " + r11);

   } 
}

class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCalc extends  Calc{
    public int mul(int n1, int n2){
        return n1 * n2;
    }

    public int div(int n1, int n2){
        return n1 / n2;
    }

}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}




