// package Complete_Java.Week 4.ObjectClassEqualToStringMethod;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("begin");

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj);
    }
}


class Laptop{
    String model;
    int price;

    public String toString(){
        return "Hey";
    }

}
