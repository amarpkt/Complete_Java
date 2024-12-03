

public class Demo4{
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer naveen  = new Developer();
        naveen.devApp(desk);
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

class Desktop{
    public void code2(){
        System.out.println("code, compile, run: Faster");
    }
}