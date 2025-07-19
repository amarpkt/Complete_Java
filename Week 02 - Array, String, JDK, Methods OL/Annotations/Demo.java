// package Week 2.Annotations;

public class Demo {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        
    }
}

class A{
   public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A Show");
    }
    
}
class B extends A{
    // @Override
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In B Show");
    }

}