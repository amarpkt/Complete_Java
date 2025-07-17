
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2{
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\11. FileReader FileWriter\\FileWriterTest\\java.txt";        
        FileReader reader = null;
        
        try {
            File file1 = new File(filePath);
            reader = new FileReader(file1);
            int i = reader.read();
            // System.out.println(i);
            // System.out.println((char)i);

            while(i != -1){
                System.out.print( i + " => ");
                System.out.println((char)i);
                i = reader.read();

            }
            
        } catch (Exception e) {
        }
        finally{
            reader.close();
        }
    }
}