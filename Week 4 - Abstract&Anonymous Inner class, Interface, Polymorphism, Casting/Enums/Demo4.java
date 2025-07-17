public class Demo4 {
    public static void main(String[] args) {

       Laptop lap = Laptop.Macbook;
       System.out.println(lap + " : " + lap.getPrice());


       for(Laptop laps: Laptop.values()){
        System.out.println(laps + " : " + laps.getPrice());
       }
    }
}

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
