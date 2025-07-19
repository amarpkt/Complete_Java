public class Demo3{
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer naveen  = new Developer();
        naveen.devApp(lap);
    }
}

class Developer{
    public void devApp(Laptop lap){
        lap.code();
    }
}

class Laptop{
    public void code(){
        System.out.println("code, compile, run");
    }
}