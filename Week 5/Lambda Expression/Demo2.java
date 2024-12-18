public class Demo2{
    public static void main(String[] args) {
        System.out.println("Begin");
        A obj = () -> System.out.println("In A Show");
        obj.show();
    }
}

@FunctionalInterface
interface A{
    void show();
}

