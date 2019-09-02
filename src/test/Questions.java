package test;

import java.util.concurrent.CompletionException;

public class Questions {

//    What is compile time and run time?

    //Answer: Compile-time is the instance where the code you entered is converted to executable while Run-time is the instance where the executable is running.

//    What is heap?

    //Answer: The heap is the runtime data area from which memory for all class instances and arrays is allocated. The heap is created on virtual machine start-up.
//
//    How java manage it's memory?
    // Answer:Java objects reside in an area called the heap. The heap is created when the JVM starts up and may increase or decrease in size while the application runs. When the heap becomes full, garbage is collected. During the garbage collection objects that are no longer used are cleared, thus making space for new objects.
//
//    What is the difference between String, StringBuffer and StringBuilder?

//    Answer:Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable.
//
//    What is Singleton class?

    //Answer:In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
//
//    What is Serialization and Deserialization?

    //Answer:Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
//
//    Which one will take more memory, an int or Integer?
    //Answer: integer, which is arbitrarily large. An int is bounded by the definition of your language, or hardware environment and therefore guaranteed to be less than “arbitrarily large”.
//
//    Why is String Immutable in Java?
   //Answer:  The string is Immutable in Java because String objects are cached in String pool. Another reason of why String class is immutable could die due to HashMap. Since Strings are very popular as HashMap key, it's important for them to be immutable so that they can retrieve the value object which was stored in HashMap.
//
//    What is constructor chaining in Java?
    //Answer: Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
//
//    The difference between Serial and Parallel Garbage Collector?

    //Answer: a serial collector is a default copying collector which uses only one GC thread for the GC operation, while a parallel collector uses multiple GC threads for the GC operation.
//
//    What is JIT stands for?
   // Answer: JIT stands for Just In time
//
//    Explain Java Heap space and Garbage collection?
    //Answer: Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create any object, it's always created in the Heap space. Garbage Collector is a program that manages memory automatically wherein de-allocation of objects is handled by Java rather than the programmer.
//
//    Can you guarantee the garbage collection process?
// Answer: garbage collection process explicitly in the code , it can choose to reject the request and so it is not guaranteed that these calls will do the garbage collection.
//    What is the difference between stack and heap in Java?
    //Answer:he main difference between heap and stack is that stack memory is used to store local variables and function call while heap memory is used to store objects in Java
}
