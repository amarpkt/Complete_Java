public class Demo {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
        obj.playMusic();

    }
}


class Car{
    public void drive(){
    }

    public void playMusic(){
        System.out.println("Play Music");
    }
}