# CSCI-605 Recitation - week 11

Here you will find a couple of code snippets as well
as some notes used in RIT course CSCI605's recitation
sessions.

---

### HW9.1: Multi-threaded Delayed Palindrome numbers 
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-495.html
- Solution files are in the url above
- Questions?

### HW9.2: Multi-threaded Lottery Number Counter
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-496.html
- Solution files are in the url above
- Questions?

### HW9.3: Ordering a Synchronized List
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-497.html
- Solution files are in the url above
- Questions?

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

### HW10.1: Synchronized blocks: Concurrent Code Flow
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-500.html
- Questions?

### HW10.2: Synchronized blocks: Concurrent Code Flow
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-501.html
- Questions?

### HW10.3: Making a thread-safe storage
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-502.html
- Questions?



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