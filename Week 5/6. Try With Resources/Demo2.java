// package Week 5.6. Try With Resources;

public class Demo2 {
   public static void main(String[] args) {
    int i = 2;
    int j = 0;
    
    try{
        j = 18/i;
    }
    catch(Exception e){
        System.out.println("Something went wrong");
    }finally{
        System.out.println("Calculation comepleted");
    }
   } 
}
