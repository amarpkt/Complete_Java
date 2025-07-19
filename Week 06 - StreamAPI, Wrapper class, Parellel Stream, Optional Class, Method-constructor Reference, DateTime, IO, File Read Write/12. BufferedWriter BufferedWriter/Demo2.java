
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2{
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\12. BufferedWriter BufferedWriter\\BufferedWriterTest\\java.txt";
        FileReader reader = null;
        BufferedReader breader = null;

        try {
            File file1 = new File(filePath);
            reader = new FileReader(file1);
            breader = new BufferedReader(reader);
            
            String br = breader.readLine();
            while(br!= null){
                System.out.println(br);
                br = breader.readLine();
            } 

            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            breader.close();
        }


        
    }
}