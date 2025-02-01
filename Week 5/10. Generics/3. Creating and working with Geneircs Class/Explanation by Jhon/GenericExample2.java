
import java.util.ArrayList;


public class GenericExample2{
    public static void main(String[] args) {

        Printer<Integer> printer3 = new Printer<>(12);
        printer3.print();

        Printer<Double> printer4 = new Printer<>(12.12);
        printer4.print();

        Printer<String> printer5 = new Printer<>("String value");
        printer5.print();


        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());  //Allowed as in Generics we added Cat
        cats.add(new Dog());  //Not Allowed as in Generics we didn't added Dog type
    
     }   
}
 class Printer<T> {
    T thingToPrint;
    
    public Printer(T thingToPrint){
     this.thingToPrint = thingToPrint;
    }
    public void print(){
     System.out.println(thingToPrint);
    }
 }

 class Cat{
   public Cat(){
   }
 }

class Dog{
   public Dog(){}

}