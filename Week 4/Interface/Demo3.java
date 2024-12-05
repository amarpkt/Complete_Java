public class Demo3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
    }
}

class B implements A{
    public void show(){
        System.out.println("show");

    }
    public void config(){
        System.out.println("config");

    }
    public void run(){
        System.out.println("run");
    }
} 

interface A extends C{
    void show();   
    void config(); 
}

interface  C{
    void run();
}


