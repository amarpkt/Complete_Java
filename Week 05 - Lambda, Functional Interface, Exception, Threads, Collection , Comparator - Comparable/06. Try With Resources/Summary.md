Try with Resources like BBufferedReader and Scanner:


Question: Is it cumpolsary to write a catch with the try block. 
Ans: NO
We can have a __try__ but we need to add __finally__ block if we want to not have the __catch__ block.

__Finally__: This is the block which gets executed irrespective of the flow.
Demo.java:
- Here we can see that when we pass the value for i as 2 then the line Calculation completed is printed 
- but when the value of i is 0, then it prints that something went wrong.

Demo2.java: 
- So here we have removed the line from try block and kept in finally 
- means regardless the value of i, weather it is 0 or 2, the line calculation is completed will get printed.
- So when we need somthing to happen at any cost then we shall write the line in Finally block.

USE CASES:
- when you have open a resource like JDBC connection or I/O resource (BufferedReader etc), then it might be possible that the try block will face any issue and you will get an exception.
- In that case you should not write the close() resources in try block, rather it shall be inside the finally block. 
- that way the resources will be closed irrespective of the error in try block.
example: Demo3.java
here we have mentioned br.close and sysout for num also 
so that in case of any error as we have no catch() block the resource shall gets closed and the sysout of num shall be printed.
