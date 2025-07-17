public class Demo2 {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        
    }
}


class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    
}