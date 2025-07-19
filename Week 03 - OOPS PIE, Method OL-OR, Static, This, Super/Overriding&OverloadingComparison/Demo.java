// package Complete_Java.Week 3.Overriding&OverloadingComparison;

public class Demo {
    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.add(3, 4);
        obj.add(3,4,1);
        

    }
}

class Calc{
    public void add(int n1, int n2 ){
        System.out.println(n1 + n2);
    }

    public void add(int n1, int n2, int n3){
        System.out.println(n1 + n2 + n3);
    }

}