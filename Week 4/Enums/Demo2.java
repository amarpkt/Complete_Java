
import jdk.jfr.Percentage;

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        Status s = Status.Running;

        if(s == Status.Running){
            System.out.println("All Good");
        }else if(s == Status.Failed){
            System.out.println("Try Again");
        }else if(s == Status.Pending){
            System.out.println("Please Wait");
        }else{
            System.out.println("Done");
        }


        switch(s){
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;
            
            case Pending:
                System.out.println("Please Wait");
                break;
            default:    
                System.out.println("Done");
        }





        
    }    
}

enum Status{
    Running, Failed, Pending, Success;
}
//Consider Status as class and remaing are its objects.
