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

    public void setName(String name) {  // name is local variable, this.name is Instance Variable
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  // now age is a local variable and this.age is instance variable
        this.age = age;
    }



}