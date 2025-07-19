
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3{
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\11. FileReader FileWriter\\FileWriterTest\\java.txt";        
        FileReader reader = null;
        
        try {
            File file1 = new File(filePath);
            reader = new FileReader(file1);

            char ch[] = new char[(int)file1.length()]; //file1.length() returns long so we converted it to integer value to specify the size of the character array
            reader.read(ch);
            for(char c : ch){
                System.out.println(c);
            }

        } catch (Exception e) {
        }
        finally{
            reader.close();
        }
    }
}