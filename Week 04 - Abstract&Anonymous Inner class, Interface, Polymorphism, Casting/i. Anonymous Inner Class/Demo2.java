public class Demo2{
    public static void main(String[] args) {
        System.out.println("begin");
        A obj = new B();
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends  A{
    public void show(){
        System.out.println("In B Show");
    }
}