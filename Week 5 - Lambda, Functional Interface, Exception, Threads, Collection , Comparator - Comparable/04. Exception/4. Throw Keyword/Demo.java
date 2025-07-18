public class Demo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero " + e);
        }
        catch (Exception e) {
            System.out.println("Something is wrong " + e);
        }
        System.out.println(j);
    }
}
