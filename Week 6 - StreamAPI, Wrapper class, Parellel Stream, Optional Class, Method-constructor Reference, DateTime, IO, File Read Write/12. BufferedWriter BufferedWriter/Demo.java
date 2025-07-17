
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo{
    public static void main(String[] args) throws IOException {
        System.out.println("t");
        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\12. BufferedWriter BufferedWriter\\BufferedWriterTest\\java.txt";
        FileWriter writer = null;
        BufferedWriter bwriter = null;

        try {
            File file1 = new File(filePath);
            writer = new FileWriter(file1);
            bwriter = new BufferedWriter(writer);

            bwriter.write("Alien");
            bwriter.newLine();
            bwriter.write(66);
            bwriter.newLine();
            bwriter.write(99);
            bwriter.newLine();
            bwriter.write((int) 66.5);
            bwriter.newLine();
            char ch[] = {'j','a','v','a'};
            bwriter.write(ch);
            bwriter.newLine();
            System.out.println("check file");
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            bwriter.flush();
            bwriter.close();
        }

    }
}