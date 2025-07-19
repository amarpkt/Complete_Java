public class Demo{
    public static void main(String[] args) {
        System.out.println("begin");

        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human{
    String name;  //Instance Variable
    int age;      //Instance Variable

    public String getName() {
        return name;
    }

    public void setName(String n) {  // n is local variable, name is Instance Variable
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  // now not sure weather age is local or instance
        age = age;
    }



}