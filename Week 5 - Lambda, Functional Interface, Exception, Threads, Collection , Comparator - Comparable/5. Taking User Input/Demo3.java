import java.util.Scanner;

class Demo3{
    public static void main(String[] args)  {
        System.out.println("enter number");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num);

        s.close();
    }
}