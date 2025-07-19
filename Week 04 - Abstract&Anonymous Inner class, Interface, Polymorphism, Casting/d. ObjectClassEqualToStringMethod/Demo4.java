// package Complete_Java.Week 4.ObjectClassEqualToStringMethod;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("begin");

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj1 + " : " + obj2);
    
        // System.out.println(obj);
        System.out.println(obj1.equals(obj2));
    }
}


class Laptop{
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    public boolean equals(Laptop that){
        
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }else{
            return false;
        }

    }

    
}