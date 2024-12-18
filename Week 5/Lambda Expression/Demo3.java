public class Demo3{
    public static void main(String[] args) {
        System.out.println("Begin");
        A obj = i -> System.out.println("In A Show " + i );
        obj.show(6);
    }
}

@FunctionalInterface
interface A{
    void show(int i);
}

