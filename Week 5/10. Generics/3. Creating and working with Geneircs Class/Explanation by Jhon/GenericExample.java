
public class GenericExample{
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(11);
        printer.print();

        DoublePrinter printer2 = new DoublePrinter(11.11);
        printer2.print();

        Printer<Integer> printer3 = new Printer<>(12);
        printer3.print();

        Printer<Double> printer4 = new Printer<>(12.12);
        printer4.print();

        Printer<String> printer5 = new Printer<>("String value");
        printer5.print();
    
     }   
}

class IntegerPrinter {
    Integer thingToPrint;
    
    public IntegerPrinter(Integer thingToPrint){
     this.thingToPrint = thingToPrint;
    }
    public void print(){
     System.out.println(thingToPrint);
    }
 }

 class DoublePrinter {
    Double thingToPrint;
    
    public DoublePrinter(Double thingToPrint){
     this.thingToPrint = thingToPrint;
    }
    public void print(){
     System.out.println(thingToPrint);
    }
 }

 class Printer<T> {
    T thingToPrint;
    
    public Printer(T thingToPrint){
     this.thingToPrint = thingToPrint;
    }
    public void print(){
     System.out.println(thingToPrint);
    }
 }