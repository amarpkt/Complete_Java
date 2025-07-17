public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        int num = 7;
        System.out.println(num);

        Integer num2 = new Integer(num);  //Boxing
        Integer num3 = num;               //Auto-Boxing
        
        int num4 = num2.intValue();       //Un-Boxing
        int num5 = num2;                  //Auto-Unboxing


        String str = "12";
        int num6 = Integer.parseInt(str);  //Integer.parseInt is also a useful method



    }
}
