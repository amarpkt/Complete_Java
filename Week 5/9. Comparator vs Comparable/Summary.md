__Comparator vs Comparable__: 
- Comparator is an interface used to define custom sorting logic for objects.
- It is a part of java.util package and is commonly used when sorting collections of objects that do not have a natural ordering 
    or when a different sorting order is required.
- To understand this lets see how SORTING works first.
- we'll take an example of List (ArrayList) and see how we can sort this.
- we'll use a sort() method available in Collections Class (A class which is a part of java.util)

Demo.java: 
- here we can see that the list is simply sorted using the sort() method available inside the collection class.
- but what if we have some other requirement like we need to sort the number in this example based on the unit digit not whole.
- 43,31,72,29 are the number and we need to sort according to 3, 1, 2, 9
- for this sort of requrements we do not have any implicit methods available with us.
- we can use the COMPARATOR here (an interface)

Lets see how to use Comparator to sort these numbers accordingly: 
- Comparator is an interface of which we will use the concept of Anonymous class to implement the logic.

Demo2.java: 
- for comparing the values we can use the same class Collection class and same method sort: 
    __Collections.sort(list);__
- but here this time we need to have another argument along with nums:
    __Collections.sort(list,com);__
- this com is actually an implementation object of Comparator interface.
- inside the comparator interface implementation we can see that we've mentioned a method named compare()
- comparator is a fucntional interface with only one method compare().
    int compare(T o1, T o2);
- so we need to pass two arguments, possibly the two elements of List which we want to sort with it's unit values.
- so for swap we used modular operator to get the unit values and if the condition is true return 1 as true else -1 for false.



Demo3.java: sort the String values stored in a list according to the length of the String values stored.
- here we can see that the logic is same and only Integer is replaced by String


- Lets take another example where sorting needs to be done:
Demo4.java: Now in Demo4, we have a list of Students and we want to sort these elements as per there age.
- again we saw how we can do same by Student object in comparator


Question: Why do we need an extra code to be written to sort the numbers with unit digit and String values in Demo2 and Demo3
While in Demo.java, with simple use of sort() method we got the sorted result.
    Collections.sort(list);     //Demo.java
    Collections.sort(list,com); //Demo2.java
    Collections.sort(list,com); //Demo3.java

Answer: This is because in first case in Demo.java, we have basic integer values which needs to sorted.
- And if we can see the logic of Integer class: 

            @jdk.internal.ValueBased
            public final class Integer extends Number
                implements Comparable<Integer>, Constable, ConstantDesc {
                }
- Here we can see that the Integer class is implicitly implementing __Comparable__ interface.  

NOTE: Integer implements comparable interface means Integer is comparable. 
- SO Integer class is comparable so we can compare without comparator.
- and Student class is not comparable so we can not compare without comparator.
- So if we can make Student class comparable (by implementing comparable interface), then the student objects can be compared.

- So if we want to have this Student list sorted without the use of Comparator explicitly then we need to implement Student class also Comparable interface with some changes

Demo5.java: 
- here we will take use of comparable Interface: 
            __public interface Comparable<T> {__
                __public int compareTo(T o);__
            __}__
- if we make Student class implement Comparable then we need to implement all the associated methods as well, __compareTo()__ in this case.
- And inside the compareTo() method we have implemented the same logic what we've written inside the Demo4 inside the Comparator interface implementation.
- rest all Student class will remain same.


Lets see how we can optimze the code further: 
Demo6.java: here we have tried to reduce the code of Demo4 using Lambda Expression.


NOTE: 
1. Comparator: If you want to write the logic, on which you want to write the sorting alogorithm then use Comparator.
2. Comparable: If you want to give the power to the class itself to compare itself / compare object of itself, use comaprable.
