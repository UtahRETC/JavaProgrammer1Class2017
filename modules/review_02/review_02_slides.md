<!--
$theme: default
page_number: true
footer: Java Class - Review 2
-->

# Review 2

- **Code, code, code**
- **Main method?**
- **Code, where does it go?**
- **Coding with _style_**
- **Homework**

-----------------------------------------------------------------------------

# Code, code, code

-----------------------------------------------------------------------------

# Main method? Code, where does it go?

-----------------------------------------------------------------------------

# Coding with _style_

- What is style in code?
- How does your code look?
- Is it easy for you to read?
- Is it easy for others to read?

-----------------------------------------------------------------------------

You will read your code more often and more times that write it. Most likely, you will write your program once and only modify it a few times, but how many times will you come back to it because you forgot something about it or you need to remember how to use it?

As professional programmers, most of your time will be spent reading a line of code rather than writing it. Or at least you will have to read it more times than it took to write it in the first place, so make sure it is easy to read.

-----------------------------------------------------------------------------

## How can we do that?

There's a few techniques programmers follow to make their code more "readable" and preferences can differ from programmer to programms, but there are a few common methods that are expected of everyone.

-----------------------------------------------------------------------------

## Always use brackets

The first rule we'll place is that you should always use curly brackets (`{`/`}`) even when optional?

```java
if (isBankAccountOwner())
  System.out.println("Accessing bank account information for Marcos");
  showPrivateBankTransactions();
```

```java
if (isBankAccountOwner()) {
  System.out.println("Accessing bank account information for Marcos");
  showPrivateBankTransactions();
}
```

-----------------------------------------------------------------------------

## Indentation

Proper indentation is the easiest path to having good style when it comes to your code. Which of the two following example is easier to read? What is the code doing?

-----------------------------------------------------------------------------

```java
public class Main {
public static void fizzBuzz(String[] args) {
for (int i = 0; i < 100; i+) {
if (i % 5 == 0 && i % 3 == 0) {
System.out.println("FizzBuzz");
} else if (i % 3 == 0) {
System.out.println("Fizz");
} else if (i % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(i);
}
}
}

public static void main(String[] args) {
fizzBuzz();
}
}
```

-----------------------------------------------------------------------------

```java
public class Main {
  public static void fizzBuzz(String[] args) {
    for (int i = 0; i < 100; i+) {
      if (i % 5 == 0 && i % 3 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    fizzBuzz();
  }
}
```

-----------------------------------------------------------------------------

# Homework

-----------------------------------------------------------------------------

# Additional resources

-----------------------------------------------------------------------------

# Reference list
