__Generics__: Introduced in Java 1.5 
- Generics came into picture with the word __TypeSafety__
- Example: Demo.java

- here we can see that we have worked with Array and ArrayList
    Array: TypeSafe
    ArrayList: Non-TypeSafe
- Array is a normal class while Arraylist is a part of Collections Framework.

Array: TypeSafe
- In Array we can see that we have defined that the array is going to store the elements with data type String only.
    String names[] = new String[5];
- For pushing data we can not push any element which is not a string type.
- same goes with the data pull, we can not pull any data which we can store in integer type variable
- this gives a compile time error, so you won't face any runtime error.
- this is all because of Array being type safe in nature. 
- So, TypeSafety prevents any runtime error. 


ArrayList: Non TypeSafe
- In ArrayList by default it stores all the elements as objects. 
- So all values pushed in ArrayList are of Object type irresepective of weather it looks like Strig or Integer.
- So when we feed the values using add() method then it will allow us to feed all type weather its String or Integer.
- and same is while pulling the values, we can pull it in form of String or Integer, you won't get any compile time error.
        String name3 = (String) list.get(0);
        String name4 = (String) list.get(3);  //This is allowed because of ArrayList being non typesafe
- So here in name4 we're trying to pull a value from ArrayList which has integer value stored and we're fetching it as String.
- This gives us class cast Exception error at runtime.

- this all happened because of ArrayList being non type safe.
- means we have not explicitly said that the ArrayList is going to use only String type values.
- Thus we need to make this ArrayList as a TYPESAFE with the help of Generics
- this way for any incorrect push we will get the runtime error and we can resolve in compilation time itself.
    Ex: ArrayList<String> list = new ArrayList(); --> Type Safe
        ArrayList list = new ArrayList();         --> Non Type Safe