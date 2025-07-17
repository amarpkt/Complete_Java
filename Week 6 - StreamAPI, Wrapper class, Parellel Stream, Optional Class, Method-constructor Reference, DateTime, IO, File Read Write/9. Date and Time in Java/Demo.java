public class Demo{
    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);
        
        long time = date.getTime();
        System.out.println(time);

        java.sql.Date uDate= new java.sql.Date(time);
        System.out.println(uDate);

    }
}