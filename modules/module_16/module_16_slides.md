<!--
$theme: default
page_number: true
footer: Java Class - Module 16
-->

# Module 16

- **Review of Previous Week**
- **What are Exceptions?**
- **Why do we need them?**
- **How can we use them?**
- **Errors vs Exceptions**
- **Additional resources**

-----------------------------------------------------------------------------

# Review of Previous Week

-----------------------------------------------------------------------------

# What are Exceptions?

-----------------------------------------------------------------------------

## _The code where an error occurs is not the code that knows how to properly deal with the error._

-----------------------------------------------------------------------------

# Why do we need them?

-----------------------------------------------------------------------------

# How can we use them?

-----------------------------------------------------------------------------

## The `throw` keyword

-----------------------------------------------------------------------------

## The `throws` keyword

-----------------------------------------------------------------------------

## The `try`/`catch`/`finally` keywords

```java
try {
  // Code that may throw an exception
} catch (Exception ex) {
  // Handle the error and do something else
} finally {
  // Code to run after success or failure
}
```

-----------------------------------------------------------------------------

### `catch`

-----------------------------------------------------------------------------

### `finally`

```java
// See code/Finally.java
try {
  System.out.println("The `try` code block is running.");
  throw new Exception();
} catch (Exception ex) {
  System.out.println("The `catch` code block is running.");
  return;
} finally {
  System.out.println("The `finally` code block is running.");
}
```

-----------------------------------------------------------------------------

# Errors vs Exceptions

-----------------------------------------------------------------------------

### Common exception classes

- `NullPointerException`: _Thrown when an application attempts to use null in a case where an object is required._ [1]
- `ArrayIndexOutOfBoundsException`: _Thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array._ [2]
- `ArithmeticException`: _Thrown when an exceptional arithmetic condition has occurred. For example, an integer "divide by zero" throws an instance of this class._ [3]

-----------------------------------------------------------------------------

# Additional resources

- _Lesson 16: Exceptions_ by Michael Fudge https://youtu.be/R86ObiKhMNc

-----------------------------------------------------------------------------

# Reference list

1. https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html
2. https://docs.oracle.com/javase/7/docs/api/java/lang/ArrayIndexOutOfBoundsException.html
3. https://docs.oracle.com/javase/7/docs/api/java/lang/ArithmeticException.html
