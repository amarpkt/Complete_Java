public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        Status s = Status.Pending;
        System.out.println(s);

        //Index Value:
        System.out.println(s.ordinal());

  
        // To print all:
        Status[] ss = Status.values();
        for(Status j : ss){
            System.out.println(j + " : " + j.ordinal());
        }



    }    
}

enum Status{
    Running, Failed, Pending, Success;
}

//Consider Status as class and remaing are its objects.
