public class Demo{
    public static void main(String[] args) {
        int num = 8;
        Integer num1 = new Integer(9);   //Boxing
        System.out.println(num1);

        Integer num2 = 10;               //Auto Boxing
        System.out.println(num2);

        int num3 = num2.intValue();
        System.out.println(num3);         //Un-Boxing

        int num4 = num2;
        System.out.println(num3);         //Auto Un-Boxing

        String str = "12";
        int num5 = Integer.parseInt(str);  //Parsing integer value from String object
        System.out.println(num5);
    }
}