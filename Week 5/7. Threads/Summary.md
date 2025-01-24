Introduciton to Threads:

Question : how a softweare runs in a computer?
Ans: Example, when you have to add two number.
- Software received two inputs like 2 and 2 to add.
- in transfers the numbers to OS of the computer to do the processing.
- OS uses the CPU and do the processing. 

Scenario 2: for a big software to run on the system or where we need to run multiple softwares in the system.
- So in this condition the OS shall support the working of multiple softwares at a time.
- this is called multi-tasking where multiple tasks are running at the same time.
- It's not like the CPU is multitasking but in actual it's __TimeSharing__
- in time sharing the CPU giveds fraction of time to one s/w, then to other s/w, then to other.
- and in returns it looks like it's all working at the same time.
- so all these softwares run in parellel and to us humans it looks like it's all being processed at the same time.
- so we're browsing, listening music, wokring on a s/w all at a time and it's actually a mutitasking of CPU which in bottom line is a result of
timesharing and seems like to us that it's all happening in parellel.


Scenario 3: what if in a single process happening in timesharing, we have multiple things happening. 
Example: We are writing a code in VS Code, and while we're writing the CPU is also throwing error and playing an error music or voice.
- so for a single task three sub-tasks are also happening in parellel.
- and these subTasks are known __THREADS__ which are smallest unit of a Task being processed by CPU.
Example 2: when we're playing a game , then in that game we can see multiple players are moving and doing the things at the same time.
- not only this, the other graphics is also moving along with players. 
- so this is because every single entity which is thread is being processed at same time in parellel.

- also in our Task manager we can see that multiple threads are working at the same time.