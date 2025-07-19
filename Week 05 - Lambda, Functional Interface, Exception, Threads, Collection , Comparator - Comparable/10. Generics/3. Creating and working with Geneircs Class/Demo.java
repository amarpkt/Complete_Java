

public class Demo {
    public static void main(String[] args) {

        Student1<Integer> st = new Student1<>(10);
        st.display();
        st.getObj();

        Student1<String> st2 = new Student1<>("Hello Kid");
        st2.display();
        st2.getObj();

    }
}


class Student1<T>{
    T obj;
    
    public Student1(T obj){
        this.obj = obj;
    }
    public void display(){
         System.out.println("Type of Data passed here: " + obj.getClass().getName()) ;
    }

    public void getObj(){
        System.out.println(obj);
    }

}