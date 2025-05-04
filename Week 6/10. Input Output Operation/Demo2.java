
import java.io.File;

public class Demo2{
    public static void main(String[] args) {

    try {
        // File file1 = new File("C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\IO Files\\java.txt");
        // System.out.println(file1.exists());
        //as of now we've not created any file so this will return false.
        //Now let's create a file

        // System.out.println(file1.createNewFile());
        //Now here we are creating the new File


        File dir = new File("C:\\Files\\Java\\Complete_Java\\Week 6\\10. Input Output Operation\\IO Files\\Dir");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());

    } catch (Exception e) {
            System.out.println("Some {Problem}");
    }
    }
}