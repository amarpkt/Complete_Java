// package Week 3;
// Here we have converted one instance variable of the class Mobile to static i.e. name
// Now post this change once the value of the variable is set it will be global for all
// As name is first given in obj1 then in obj2 and again in obj1 but in result it is same for both objects i.e. obj1 and obj2 

public class Demo2 {
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
        
        obj1.name = "phone";

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