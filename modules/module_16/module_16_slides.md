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

# Additional resources

- _Lesson 16: Exceptions_ by Michael Fudge https://youtu.be/R86ObiKhMNc

-----------------------------------------------------------------------------

# Reference list
