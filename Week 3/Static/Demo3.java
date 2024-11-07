// package Week 3;
//Static variables shall be called with the help of their Class Names

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("begin");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart Phone"; //Static variables shall be called with the help of their Class Names

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smart Phone"; //Static variables shall be called with the help of their Class Names
        
        Mobile.name = "phone";       //Static variables shall be called with the help of their Class Names

        obj1.show();
        obj2.show();

    }
}

class Mobile{  
    //Instance Variables (Local variables are the one which are declared inside the method say inside show() method)
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}