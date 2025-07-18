public class Demo3 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException();
            }
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
