public class Demo{
    public static void main(String[] args) {
        System.out.println("begin");
        A obj = new A();
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("In A Show");
    }
}