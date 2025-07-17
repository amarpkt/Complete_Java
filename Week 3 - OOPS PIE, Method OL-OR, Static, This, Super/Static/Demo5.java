// package Week 3;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("begin");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        
        obj1.show();
        obj2.show();

    }
}

class Mobile{  
    //Instance Variables (Local variables are the one which are declared inside the method say inside show() method)
    String brand;
    int price;
    static String name;

    static{
        name = "phone";
        System.out.println("Inside Static");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Inside constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}