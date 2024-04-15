#### https://www.markdownguide.org/cheat-sheet/

## Naming Conversion

| Identifier | Rule                                                                                                            | Example           |
|:-----------|:----------------------------------------------------------------------------------------------------------------|:------------------|
| Class      | start with the uppercase letter                                                                                 | Employee          |
| Method     | start with Lowercase letter                                                                                     | actionPerformed() |
| Variable   | start with Lowercase letter, it should not start with special characters, avoid one character variable like x,v | firstName         |
| package    | all small case, separate with **.** like com.xyz.xyz                                                            | com.org.telstra   |
| Constant   | All Upper case, separate by **_**                                                                               | MIN_AGE = 18      |

## Java Memory Management
https://www.javatpoint.com/memory-management-in-java

## Compile Language VS Interpreted Language
https://stackoverflow.com/questions/3265357/compiled-vs-interpreted-languages

## History of Java
https://www.javatpoint.com/history-of-java

## Feature of Java
https://www.javatpoint.com/features-of-java

--------------------------------------------------------
## Java is always call by value.

- Java supports call by value only. There is no call by reference in java.
- call-by-value means pass-by-vale
- call-by-reference means pass-by-reference


https://sentry.io/answers/java-pass-by-reference-or-value/#:~:text=Modern%20programming%20languages%2C%20such%20as,are%20created%20on%20the%20stack

- check `PassByValue.java` class

- Real pass-by-reference is impossible in Java. Java passes everything by value, including references. 
But you can simulate it with container Objects.

- Use any of these as a method parameter:

  - an array
  - a Collection
  - an AtomicXYZ class

And if you change its contents in a method, the changed contents will be available to the calling context.

--------------------------------------------------------------

