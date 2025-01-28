__Why we need List__: Demo.java
- here we have used the older one which is ArrayList and we can see that we have added number 5 twice and we're able to do so.
- thus ArrayList provides or supports data duplication.
- Now what if we need a data structure which shall not supports it. 
- Here comes the SET.

__SET__: 
- Set supports unique values.
- Does not follow the sequence of data stored.
- Gives random values

- There are two implementation of __Set interface__ :  __HashSet__ and __LinkedHashSet__
- also ther is one more interface which extends Set interface, which is __SortedSet__
- the class which implements SortedSet is __TreeSet__
- TreeSet gives the feature of sorted values.
Demo3.java : TreeSet




__Iterator__: Collection Interface extends another interface which is __Iterable__ interface
- Iterable interface allows a feature of iterating between the elements stored in the data structure.
Demo4.java: using iterator we can iterate between the elements and we don't need the for loop here
- hasNext() is used to check if the iterator has next value or not.
- next() print the values.