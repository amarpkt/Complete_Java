public class Demo7{
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer naveen  = new Developer();
        naveen.devApp(lap);
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: Faster");
    }
}

interface Computer{
    void code();
}