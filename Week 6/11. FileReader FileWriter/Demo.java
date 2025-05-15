
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo{
    public static void main(String[] args) throws IOException {
        System.out.println("Test");
        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\11. FileReader FileWriter\\FileWriterTest\\java.txt";        
        FileWriter writer = null;
        try{
            File file = new File(filePath);
            writer = new FileWriter(file);
            
            writer.write("Java");
            writer.write("\n");
            writer.write(65);
            writer.write("\n");
            writer.write(66);
            writer.write("\n");
            char ch[] = {'a', 'l', 'i', 'e', 'n'};
            writer.write(ch);
            writer.write("\n\n");
            

        }catch(Exception e){
            System.out.println("Some Problem");
            e.printStackTrace();
        }
        finally{
            writer.close();
        }

    }
}