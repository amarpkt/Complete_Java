// package Complete_Java.Week 3.Overriding&OverloadingComparison;

public class Demo3 {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(3, 4);
        System.out.println(r);
    }
}

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}


class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}