public class Demo{
    public static void main(String[] args) {
        System.out.println("Begin");
        B obj = new B();
        obj.show();
    }
}

@FunctionalInterface
interface A{
    void show();
}


class B implements  A{
    public void show(){
        System.out.println("In A Show");
    }
}