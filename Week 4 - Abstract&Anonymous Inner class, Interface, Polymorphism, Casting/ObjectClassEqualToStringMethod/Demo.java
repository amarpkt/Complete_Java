// package Complete_Java.Week 4.ObjectClassEqualToStringMethod;

public class Demo {
   public static void main(String[] args) {
    System.out.println("begin");

    Laptop obj = new Laptop();
    obj.model = "Lenovo Yoga";
    obj.price = 1000;

    // System.out.println(obj);
    System.out.println(obj.toString());

   } 
}

class Laptop{
    String model;
    int price;
}