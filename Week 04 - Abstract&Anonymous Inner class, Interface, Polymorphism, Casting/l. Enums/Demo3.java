public class Demo3 {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s.toString()); //Proof that Status extends Object class (toString() is a method of Object class)
        System.out.println(s.hashCode()); //Proof that Status extends Object class (hashCode() is a method of Object class)
        System.out.println("\nclass name of s: " + s.getClass());   //Status
        System.out.println("Super class name of s: " + s.getClass().getSuperclass()); //Enum
       
    }    
}

enum Status{
    Running, Failed, Pending, Success;
}