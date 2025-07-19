public class Demo2{
    public static void main(String[] args) {
        System.out.println("Begin");
        // B obj = new B();
        A obj = new A(){
            public void show(){
                System.out.println("In A Show");
            }
        };
        obj.show();
    }
}

@FunctionalInterface
interface A{
    void show();
}

