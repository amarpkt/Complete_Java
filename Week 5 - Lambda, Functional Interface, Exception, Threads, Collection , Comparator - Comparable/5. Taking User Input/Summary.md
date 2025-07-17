First lets check about System.out.println("begin");

- here __println__ is a method defined inside the PrintStream class.
- and __out__ is an object of PrintStrem class created inside the System class.
- and the object is created as static object : public static final PrintStream out = null;
- this way we can access the object with the class name itself like System.out
- and later on we can access the println method of PrintStream object also.


now let's take a look on the part of taking input from user on console.
- for this we could think of a same class System with having an object for input just like it has the object __out__ for output. 
- on searching we can see that the class has an __in__ object which is an object of __InputStream__ class but this will do the job.
- so now we will use it like --> __System.in__ for taking input from the user.
- and the method to take input will be read() so the whole line will be like __System.in.read()__
- only thing is that as it's for Input so we need to handle a checked exception either via try-catch or we can duck by throws.
- for now we will duck it.

Problem: the problem with this aproach is that the number taken as input will be prinsted as ASCII value
- means when you enter 4 then output will be 52
- when you will enter A then output will be 65

Need to think of another solution: __BufferedReader__


BufferedReader:
- There is no class which has object of Bufferedreader so we need to create the object first.
    BufferedReader bf = new BuufferedReader();
- This BufferedReader needs an object of InputStreamReader as argument to be passed 
- and InputStreamReader itself need an object of InputStream which we can see in System class as object __in__
- so we will use it like this:
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);
- this way we can resolve our issue which we saw in the above __System.in.read()__ way.

- here in Demo2.java we used method readLine() which stores the input as string, and to convert this into integer we can use Integer.parseInt().


Note: Buffererdreader is a resource which needs to be closed as well.
bf.close() will do the job.



__Scanner__:
- this method is used to take the input from the user also.
- good thing is that there is not much code requirement as we saw in Bufferedreader case.
  Scanner s = new Scanner(System.in);

- here also the Scanner object needs to be supplied with the object of System class in -->  __System.in__ 
