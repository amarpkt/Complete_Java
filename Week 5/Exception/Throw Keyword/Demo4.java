public class Demo4 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("I Don't want to print zero");
            }
        } 
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("Thats the default value of J" + e);
        }
        catch (Exception e) {
            System.out.println("Something is wrong " + e);
        }
        System.out.println(j);
    }
}
