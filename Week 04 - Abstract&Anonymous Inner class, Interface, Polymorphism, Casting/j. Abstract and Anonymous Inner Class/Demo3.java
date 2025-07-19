public class Demo3{
    public static void main(String[] args) {
        System.out.println("begin");
        A obj = new A(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
}

abstract class A{
    public abstract void show();
}