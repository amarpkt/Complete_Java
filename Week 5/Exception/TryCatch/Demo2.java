// package TryCatch;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("begin");
        int i = 0;
        int j = 0;
        try {
            j = 18/i;    
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
        System.out.println(j);

    }
}