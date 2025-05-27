
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LaunchIO_2 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Files\\Java\\Complete_Java\\Week 6\\14. Serialization and Deserialization\\serial.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student st = (Student) ois.readObject();
            st.disp();
            System.out.println("Completed");
            ois.close();
            fis.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
