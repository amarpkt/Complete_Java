class Demo2{
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        //This will also  work as B extends A and its methods as well
        B obj2 = new B();
        obj2.show();
        obj2.config();
    }
}

class A{
    public void show(){
        System.out.println("in A Show");
    }

    public void config(){
        System.out.println("in A Config");
    }
}

class B extends A{

    public void show(){
        System.out.println("in B Show");
    }

}