public class Demo {
 public static void main(String[] args) {
    System.out.println("begin");
    String name = new String("amar");
    System.out.println(name);

    System.out.println(name.hashCode());

    System.out.println("hello " + name);

    System.out.println(name.concat(" pathak"));

    String s1 = "Naveen";
    String s2 = "Naveen";
    System.out.println(s1.equals(s2));

    System.out.println(s1.hashCode() + " :  " + s2.hashCode() + " : " + name.hashCode() );

 }   
}