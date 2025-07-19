public class Demo2 {
    public static void main(String[] args) {

        A obj = new A();
        obj.show1();

        A obj1 = (A) new B();
        obj.show1();

        B obj2 = new B();
        obj2.show2();

        B obj3 = (B) obj1;
        obj3.show2();


        
    }
}


class A{
    public void show1(){
        System.out.println("in A Show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }

}