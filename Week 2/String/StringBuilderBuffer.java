public class StringBuilderBuffer {
public static void main(String[] args) {
    System.out.println("begin");

    StringBuffer sb = new StringBuffer(); 
    System.out.println(sb.capacity());  //even an empty SB object has size of 16 bytes


    StringBuffer sb2 = new StringBuffer("Navin");
    System.out.println(sb2.capacity());


    //APPEND
    sb2.append(" reddy");
    System.out.println(sb2);

    //TOSTRING
    String str = sb2.toString();
    System.out.println(str);

    //DELETE A CHARACTER
    sb2.deleteCharAt(2);
    System.out.println(sb2);

    //INSERT A CHARACTER
    sb2.insert(2, 'v');
    System.out.println(sb2);

    StringBuffer sb3 = new StringBuffer();
    sb3.setLength(30);
    System.out.println(sb3.length());
    System.out.println(sb3.capacity());

    sb3.ensureCapacity(100);
    sb3 = new StringBuffer("amar");
    // sb3.setLength(30);
    System.out.println(sb3.length());
    System.out.println(sb3.capacity());
    

    }    
}