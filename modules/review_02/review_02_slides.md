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

## The Main Method

```java
public static void main(String[] args) {
  System.out.println("Hello world!");
}
```

-----------------------------------------------------------------------------

## What are the parts?

```java
public static void main(String[] args) {
  System.out.println("Hello world!");
}
```

- public
- static
- void
- main
- String[] args
- `{` and `}`
- body

-----------------------------------------------------------------------------

## What are the parts?

```java
public static void main(String[] args) {
  System.out.println("Hello world!");
}
```

- public: Java can see and run this method
- static: There is only one copy of this method, not one per _instance_ of the
class
- void: The method doesn't return anything
- main: The name of the method!
- String[] args: User input from the terminal
- `{` and `}`: Shows where the body of the method starts and ends
- body: Put logic inside of here

-----------------------------------------------------------------------------

## Why do we need a main method?

The main method is the **entry point** into your program. It is like the **front
door** of your house. You can't get into your house without a door!

Your program can have lots of reusable parts, like _classes_ and _methods_. But
it needs to start from a single specific place.

-----------------------------------------------------------------------------

## Where does the main method go?

The main method should be defined inside of a _class_

TODO: info here

-----------------------------------------------------------------------------

## Example: Pet Store

We have these classes:

- `PetStore`
- `Animal`
- `Food`

You could put the main method in the `PetStore` class, like this:

```java
public class PetStore {

  public static void main(String[] args) {
    System.out.println("Welcome to the pet store!");

    PetStore myStore = new PetStore();
    // More logic here...
  }

  // More PetStore methods here...
}
```

Then you call it from the terminal like this:

```
java PetStore
```

This means, "Hey Java, start running my program, and the starting point is in
the `PetStore` class!"

Or, "Hey Java, go into my house, and here is where the front door is!"

-----------------------------------------------------------------------------

## Why just _one_ main method?

Your house only needs one front door!

You _could_ have a main method defined in multiple classes, but you still have
to tell Java _which one to use_ when you run your program. You have to choose:
do you want to go into the house from the front door or the back door?

-----------------------------------------------------------------------------

## Where does code go?

- Where does code go?
  - Classes
  - Methods
  - Fields
  - Statements
  - Control Flow
  - Method declaration vs. method call

-----------------------------------------------------------------------------

# Coding with _style_

- What is style in code?
- How does your code look?
- Is it easy for you to read?
- Is it easy for others to read?

-----------------------------------------------------------------------------

You will read your code more often and more times than write it. Most likely, you will write your program once and only modify it a few times, but how many times will you come back to it because you forgot something about it or you need to remember how to use it?

As professional programmers, most of your time will be spent reading a line of code rather than writing it. Or at least you will have to read it more times than it took to write it in the first place, so make sure it is easy to read.

-----------------------------------------------------------------------------

## How can we make our code easy to read?

There's a few techniques programmers follow to make their code more "readable" and preferences can differ from programmer to programmer, but there are a few common methods that are expected of everyone.

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
