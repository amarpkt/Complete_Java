
import java.io.File;

public class Demo3{
    public static void main(String[] args) {
        try {
            File dir = new File("C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\Demo3Dir");
            dir.mkdir();
            System.out.println("Is directory created: " + dir.exists());

            File file = new File("C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\Demo3Dir\\java.txt");
            file.createNewFile();
            System.out.println("Is file created: " + file.exists());

            System.out.println("New Directory and file created");
            
        } catch (Exception e) {
            System.out.println("Some problem occured while working in IO operation");
        }

    }
}