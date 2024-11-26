public class Demo2 {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();        //drive method was declared in parent class Car and defined in Child class WagonR
        obj.playMusic();    //playMusic() method was declared in parent class Car only

    }
}

abstract class Car{
    public abstract void drive();
    
    public void playMusic(){
        System.out.println("Play Music ..");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving..");
    }
}