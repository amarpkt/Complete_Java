Syntax: 
    ArrayList<String> list = new ArrayList<String>();
OR
     ArrayList<String> list = new ArrayList<>();


- On right hand side it's not required to mention String



Demo2.java: 
- here we can see that in list we are allowed to add any type weather Student or Employee.
- if we will add Generics then it will not be allowed, 
Ex: 
ArrayList<Student> list = new ArrayList(); --> Only Student objects are allowed to add
ArrayList<Employee> list = new ArrayList(); --> Only Employee Objects are allowed to add