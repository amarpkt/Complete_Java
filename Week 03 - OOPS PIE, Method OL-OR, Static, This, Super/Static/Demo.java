// package Week 3;
//Here we're just seeing that the three instance variables are part of the objects obj1 and obj2
public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smart Phone";

        obj1.show();
        obj2.show();

    }
}

class Mobile{  
    //Instance Variables (Local variables are the one which are declared inside the method say inside show() method)
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}