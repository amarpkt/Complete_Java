public class Demo2 {
    public static void main(String[] args) {
        // System.out.println("begin");
        A obj = new A();
        obj.show();

        A.B obj2 = new A.B();
        obj2.config();


    }
}

class A{
    int age;
    public void show(){
        System.out.println("In show");
    }

    static class B{
        public void config(){
            System.out.println("In Config");
        }
    }
}
