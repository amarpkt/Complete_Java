public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0){
                throw new NaveenException("I Don't want to print zero");
            }
        } 
        catch (NaveenException e) {
            System.out.println("Inside catch block of Naveen Exception");
            j = 18/1;
            System.out.println("Thats the default value of J" + e);
        }
        catch (ArithmeticException e) {
            j = 18/1;
            // System.out.println("Thats the default value of J" + e);
        }
        catch (Exception e) {
            System.out.println("Something is wrong " + e);
        }
        System.out.println(j);
    }
}


class NaveenException extends Throwable{
    public NaveenException(String str){

    }

}