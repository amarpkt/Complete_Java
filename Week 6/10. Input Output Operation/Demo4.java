
import java.io.File;

public class Demo4{
    public static void main(String[] args) {

        String filePath = "C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\Demo3Dir\\java.txt";
        String dirPath = "C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\Demo3Dir";

        try {
            File file = new File(filePath);
            System.out.println(file.exists());
            System.out.println(file.getPath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());

            File dir = new File(dirPath);
            System.out.println(dir.isDirectory());
            System.out.println(dir.isFile());

            File file2 = new File(dirPath);
            String files[] = file2.list();
            int count = 0;
            for(String name : files){
                System.out.println(name);
                count++;
            }
            System.out.println("Number of files:  " + count);


        } catch (Exception e) {
            System.out.println("Some Problem with IO Operations");
        }



    }
}