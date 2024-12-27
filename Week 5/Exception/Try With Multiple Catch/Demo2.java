public class Demo2 {
    public static void main(String[] args) {
        System.out.println("begin");
        int i = 1;
        int j = 0;

        int num[] = new int[5];


        try {
            j = 18/i;
            System.out.println(num[5]);    
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println("value of j = " + j);
    }
}
