public class Demo{
    public static void main(String[] args) {

        Student stu1= new Student(1, "Rohan", 16);
        System.out.println(stu1);

        Student stu2= new Student(2, "Rohit", 15);
        System.out.println(stu2);

    }
}

class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }



}