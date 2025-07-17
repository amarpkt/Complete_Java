public class Demo3 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        
    }
}

class A {
    public void show(){
        System.out.println("in A Show");
    }
}

class B extends  A{
    public void show(){
        System.out.println("in B Show");
    }
}
