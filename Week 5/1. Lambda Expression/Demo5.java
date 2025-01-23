public class Demo5{
    public static void main(String[] args) {
        System.out.println("Begin");
        A obj = (i,j) ->  i+ j;
        int result = obj.add(4, 5); 
        System.out.println(result); 
        
    }
}

@FunctionalInterface
interface A{
    int add(int i, int j);
}

