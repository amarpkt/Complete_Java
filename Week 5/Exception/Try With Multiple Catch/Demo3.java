public class Demo3 {
    public static void main(String[] args) {
        System.out.println("begin");
        int i = 2;
        int j = 0;
        String str = null;//"amar";

        int num[] = new int[5];


        try {
            j = 18/i;
            System.out.println("value of index element: " + num[5]);
            System.out.println(str.length());    
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit " + e);
        }
        catch (Exception e) {
            System.out.println("Something is wrong " + e);
        }
        System.out.println("value of j = " + j);
    }
}
