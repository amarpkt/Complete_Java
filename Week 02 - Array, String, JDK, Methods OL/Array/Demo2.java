
/*
 * here we are trying to learn how to create an array of objects
 */


public class Demo2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Navin";
        s1.rollNo = 1;
        s1.marks = 88;

        Student s2 = new Student();
        s2.name = "Harsh";
        s2.rollNo = 2;
        s2.marks = 67;

        Student s3 = new Student();
        s3.name = "Kiran";
        s3.rollNo = 3;
        s3.marks = 97;


        //Creating an ARRAY OF OBJECTS
        Student  students[] = new Student[3];  /* Here in this line we are not creating objects 
        * We're creting the array of reference variables of the three objects which we created manually 
        * These three reference variabls are s1,s2, s3 and these are the reference variables of the corresponding objects which we 
        * have created manually above
        */  
        students[0] = s1;
        students[1] = s2;
        students[2] = s3; 


        for(int i = 0 ; i < students.length ; i++){
            System.out.println(students[i]);  //Here it will values of s1, s2, s3
        }
        //We know s1, s2, s3 are just the reference variables which hold the address of the actual object created 
        // so we need something else rather than just printing the reference variables


        System.out.println("\nName : RollNo : Marks");
        for(int i = 0 ; i < students.length ; i++){
            System.out.println(students[i].name + "   " + students[i].rollNo + "       " + students[i].marks);  
        }


    }
}

class Student{
    String name;
    int rollNo;
    int marks;
}