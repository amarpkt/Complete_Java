public class Demo3 {
    public static void main(String[] args) {
        Car obj = new AdvancedWagonR();
        obj.drive();        //drive method was declared in parent class Car and defined in Child class WagonR
        obj.playMusic();    //playMusic() method was declared in parent class Car only
        obj.fly();

    }
}

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Play Music ..");
    }
}

abstract class WagonR extends Car{
    
    public void drive(){
        System.out.println("Driving..");
    }

}

class AdvancedWagonR extends  WagonR{

    public void fly() {
        System.out.println("flying..");
    }

}