
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Demo{
    public static void main(String[] args) {
        // String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\13. PrintWriter\\PrintWriterTest\\java.txt";
        // FileWriter writer  =null;
        PrintWriter pwriter = null;
        try {
            // File file1 = new File(filePath);
            // writer = new FileWriter(file1);
            pwriter = new PrintWriter(new FileWriter(new File("C:\\Files\\Java\\Complete_Java\\Week 6\\13. PrintWriter\\PrintWriterTest\\java.txt")));
            pwriter.write(65);
            pwriter.write("\n");
            pwriter.write(66);
            pwriter.write("\n");

            
            pwriter.println(65);
            pwriter.println(66);
            pwriter.println(true);
            pwriter.println(14.5);
            pwriter.println("java");
            pwriter.println('A');

            System.out.println("Done");


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            pwriter.close();
        }


        
    }
}