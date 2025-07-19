
public class GenericExample{
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(11);
        printer.print();

        DoublePrinter printer2 = new DoublePrinter(11.11);
        printer2.print();
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