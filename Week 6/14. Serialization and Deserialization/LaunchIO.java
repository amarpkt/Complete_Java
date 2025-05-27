
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LaunchIO {

    public static void main(String[] args) {
        // System.out.println("Main:");
        Student stu1 = new Student(1, "Rohit", 16);
        // stu1.disp();

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Files\\Java\\Complete_Java\\Week 6\\14. Serialization and Deserialization\\serial.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(stu1);
            System.out.println("check file created with byte code");
            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
