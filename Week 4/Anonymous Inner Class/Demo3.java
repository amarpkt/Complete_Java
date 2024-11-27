public class Demo3{
    public static void main(String[] args) {
        System.out.println("begin");
        A obj = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("In A Show");
    }
}