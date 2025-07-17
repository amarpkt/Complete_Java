// package Complete_Java.Week 4.UpcastingAndDowncasting;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        int i = 5;
        double j = i;
        System.out.println(j);  //No data loss occured

        double a = 4.5;
        int b = (int) a ;
        System.out.println(b);   //But we lossed data of .5 as O/P = 4 not 4.5


    }
}
