public class Demo2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i;
        } 
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("Thats the default value of J");
        }
        catch (Exception e) {
            System.out.println("Something is wrong " + e);
        }
        System.out.println(j);
    }
}
