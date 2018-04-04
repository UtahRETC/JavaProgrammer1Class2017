<!--
$theme: default
page_number: true
footer: Java Class - Module 16
-->

# Module 16

- **Review of Previous Week**
- **What are Errors?**
- **What are Exceptions?**
- **Why do we need them?**
- **How can we use them?**
- **Additional resources**

-----------------------------------------------------------------------------

# Review of Previous Week

-----------------------------------------------------------------------------

# What are Errors?

-----------------------------------------------------------------------------

# What are Exceptions?

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

# Additional resources

- _Lesson 16: Exceptions_ by Michael Fudge https://youtu.be/R86ObiKhMNc

-----------------------------------------------------------------------------

# Reference list
