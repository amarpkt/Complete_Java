// package Week 5.6. Try With Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
   public static void main(String[] args) throws IOException {
    int num = 0;
    BufferedReader br = null;
    try {
        System.out.println("Begin");
        br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
    }
    finally{
        System.out.println("value of num: " + num);
        br.close();
    }
   } 
}
