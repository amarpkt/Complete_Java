

public class Demo {
    public static void main(String[] args) {
        System.out.println("begin");
        // A obj1 = new A(); // Not allowed
        A obj1;
        // B obj2 = new B(); // Not allowed
        B obj2;

        D obj = new D();
        obj.show();
        obj.config();


        //Varibles access in interface E
        System.out.println(E.age); //We're able to access without object (although it's not allowed for interface) because of static nature of interface variables
        System.out.println(E.area); //We're able to access without object (although it's not allowed for interface) because of static nature of interface 
        // E.age = 42; //Can not assign the value being a static variable of Interface 
        // E.area = "delhi"; //Can not assign the value being a static variable of Interface

        /*  Although F being an implementing class is able to inherit the values of it's parent interface but if of no use
            because the variables of interface are static which can be accessed by class name itself
            so better to use class name. But to think of errorm there is no harm in usinf F class
        */
        F obj3 = new F();
        System.out.println(obj3.age);  //Allowed but is redundant code
    }
}


abstract class A{
    public abstract void show();
    public abstract void config();
}

interface B{
    void show();   //They are by default public and abstract, so no need to mention in interface
    void config(); //They are by default public and abstract, so no need to mention in interface
}

class C extends A{
    public void show(){
        System.out.println("inside show of C");
    }

    public void config() {
        System.out.println("Inside config of C");
    }
}

class D implements B{
    public void show() {
        System.out.println("Inside show od D");    
    }

    public void config() {
        System.out.println("Inside config of D");    
    }
}

interface E{
    int age = 40;
    String area = "Mumbai";
}
class F implements E{

}
