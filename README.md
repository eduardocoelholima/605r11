# CSCI-605 Recitation - week 11

Here you will find a couple of code snippets as well
as some notes used in RIT course CSCI605's recitation
sessions.

---

### HW10.1: Multi-threaded Delayed Palindrome numbers 
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-477.html

### HW10.2: Multi-threaded Lottery Number Counter
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-478.html

### HW10.3: Ordering a Synchronized List
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-479.html


### HW11.1: Synchronized blocks: Concurrent Code Flow
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-481.html

### HW11.2: Synchronized blocks: Concurrent Code Flow
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-482.html

### HW11.3: Making a thread-safe storage
https://www.cs.rit.edu/~hpb/Lectures/2211/605/605-483.html

### Synchronized block 1
- Thread_5.java
- Will any thread other than the main one run in parallel?
- How can we make second go before 1st?

### Synchronized block 2
- Thread_5b.java
- Will any thread run in parallel? Why?

### Wait-Notify 1: Provider-Consumer Protocol [1]
- {Drop, Consumer, Producer, ProducerConsumerExample}.java
- Go through code (drawings might help)
- How many messages can be stored by a Drop instance at any time?
- Which class uses the wait/notify mechanism? What for?
- Which code blocks/signatures use the synchronized keyword?
- How is the flag 'empty' being used?

### Wait-Notify 2: Sender-Receiver Synchronization [2]
- {Data, Sender, Receiver, NetworkDriver}.java
- Go through code (drawings might help)
- How related is the send/receive protocol to the producer/consumer one?
- What are the differences? 



[1] Code from https://docs.oracle.com/javase/tutorial/essential/concurrency
/guardmeth.html

[2] Code from https://github.com/eugenp/tutorials/tree/master/core-java
-modules/core-java-concurrency-basic-2/src/main/java/com/baeldung/concurrent/waitandnotify

---

Please let me know if you have any questions. You can
always use MyCourses discussion forum (good idea) or
email me or Professor Bischof. I will reply the questions
either to the discussion forum or will email everyone so
every student can benefit from the answers provided.

Cheers,
eduardo.lima at mail.rit.edu