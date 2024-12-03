public class Demo{
    public static void main(String[] args) {
        System.out.println("begin");

        Parent obj1 = new ChildA();
        Parent obj2 = new ChildB();

        obj1.show();
        obj2.show();

    }
}

class ChildA extends Parent{
    public void show(){
        System.out.println("In Child A Show");
    }
}
class ChildB extends Parent{
    public void show(){
        System.out.println("In Child B Show");
    }
}
class Parent {
    public void show(){
        System.out.println("In Parent Show");
    }
}