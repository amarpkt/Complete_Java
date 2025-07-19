
import java.time.LocalDate;
import java.time.LocalTime;

public class Demo2{
    public static void main(String[] args) {
       LocalDate date = LocalDate.now();
       System.out.println(date);
       
       int dayOfMonth=date.getDayOfMonth();
       int dayOfYear=date.getDayOfYear();
       int month=date.getMonthValue();

       System.out.println("day of the month: " + dayOfMonth);
       System.out.println("day of the year: " + dayOfYear);
       System.out.println("month of the year: " + month);

       LocalTime time = LocalTime.now();
       System.out.println(time);

       int hour = time.getHour();
       int min = time.getMinute();
       int sec = time.getSecond();
       int nanoSecond = time.getNano();
       System.out.println(hour  + " : " + min + " : " + sec + " : " + nanoSecond);
        
    }
}