public class Demo{
    public static void main(String[] args) {

        System.out.println("Hello World");

        Computer obj = new Computer();
        obj.playMyusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
}

class Computer{
    public void playMyusic(){
        System.out.println("Music Playing ...");
    }

    public String getMePen(int cost){
        if (cost >= 10){
            return "pen";    
        }
        return "nothing";
    }
}