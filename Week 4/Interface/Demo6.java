public class Demo6{
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer naveen  = new Developer();
        naveen.devApp(desk);
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

class Laptop extends  Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop extends  Computer{
    public void code(){
        System.out.println("code, compile, run: Faster");
    }
}

abstract class Computer{
    public abstract  void code();
}