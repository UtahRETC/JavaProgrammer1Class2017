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

# Where does code go?

In order to speak English properly, we need to understand English grammar.
Grammar helps us know how to arrange our words into sentences so others can
understand us correctly.

Java has grammar rules too! We need to follow the rules of Java's grammar so
that _the computer_ can understand us correctly.

Let's talk about the most important parts of the grammar, from **smallest** to
**biggest**.

-----------------------------------------------------------------------------

## Statements

A statement in Java is like a _single sentence_.

Here are some examples of statements:

```java
score = hwScore;

greet();

System.out.println("My score is " + hwScore);

return score;
```

Notice:

- they all look a little different!
- they each contain a little bit of logic
- every program's logic is made up of statements

-----------------------------------------------------------------------------

## Fancier statements

```java
if () {
  
}

while () {
  
}

for () {
  
}
```

These statements are for control flow. The sections in between the curly braces
`{ }` are run when the logic in the parentheses `( )` is true. The code inside
the curly braces _will also be statements_.

-----------------------------------------------------------------------------

## Declaring a method

A method declaration looks like this:

```java
public int setHomeworkScore(int hwScore) {
  score = hwScore;
  greet();
  System.out.println("My score is " + hwScore);
  return score;
}
```

Parts:

- public
- int
- setHomeworkScore
- `(` and `)`
- int hwScore
- `{` and `}`

-----------------------------------------------------------------------------

## A simple class

All of this code goes in a file called `Student.java`:

```java
public class Student {

  private String firstName;
  private String lastName;
  private int score;

  public String greet() {
    return "Hi, my name is " + firstName;
  }
  
  public int setHomeworkScore(int hwScore) {
    greet();
    score = hwScore;
    System.out.println("My score is " + hwScore);
    return score;
  }

}
```

Parts:

- This file contains the `Student` class
- The `Student` class contains some fields and method declarations
- There are three fields: `firstName`, `lastName`, and `score`
- There are two methods: `greet` and `setHomeworkScore`

-----------------------------------------------------------------------------

## Declaring a class

A class declaration looks like this:

```java
public class Student {
  
}
```

Parts:

- public
- class
- Student
- `{` and `}`

## What can we put inside of a class declaration?

- fields
- method declarations

-----------------------------------------------------------------------------



- Where does code go?
  - Classes
  - Methods
  - Fields
    - teach variables first!
  - Statements
  - Control Flow
  - Method declaration vs. method call


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

TODO: the logic in our program is in statements, and statements

TODO: define a statement (in the previous section), show several examples combined in a method

-----------------------------------------------------------------------------

## Where does the main method go?

The main method should be defined inside of a _class_

TODO: info here

-----------------------------------------------------------------------------

## Example: Pet Store

TODO: make a Main class

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

TODO: the main method has to look the right way so Java knows how to open the door

-----------------------------------------------------------------------------

## Why just _one_ main method?

Your house only needs one front door!

You _could_ have a main method defined in multiple classes, but you still have
to tell Java _which one to use_ when you run your program. You have to choose:
do you want to go into the house from the front door or the back door?

TODO: get rid of the "back door" idea

TODO: talk about how it doesn't help us when there are multiple main methods, Java will do whatever we tell it to do

TODO: you have been telling Java where to start this whole time!

-----------------------------------------------------------------------------

# Coding with _style_

- What is style in code?
- Is it easy for you to read?
- Is it easy for others to read?

-----------------------------------------------------------------------------

As professional programmers, most of your time will be spent reading a line of code rather than writing it. Or at least you will have to read it more times than it took to write it in the first place, so make sure it is easy to read.

Remember, you will read your code more often than you will write it.

-----------------------------------------------------------------------------

## How can we make our code easy to read?

There's a few techniques programmers follow to make their code more "readable" and preferences can differ from programmer to programmer, but there are a few common methods that are expected of everyone.

-----------------------------------------------------------------------------

## Always use brackets

The first rule we'll place is that you should always use curly brackets (`{`/`}`) even when they are optional.

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

Second, proper indentation is another easy rule to follow to have good style.

Which of the two following examples is easier to read? What is the code doing?

-----------------------------------------------------------------------------

```java
public class Main {
public static void main(String[] args) {
for (int i = 0; i < 100; i++) {
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
}
```

-----------------------------------------------------------------------------

```java
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
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
}
```

-----------------------------------------------------------------------------

# Whitespace

What is whitespace? Whitespace are new lines, tab characters, and space characters. Adding whitespace in your code can help you create visual "blocks" and "sections."

-----------------------------------------------------------------------------

## Adding whitespace in a line of code

```java
int a = 7;
int b = 20;
int c = 2*(a-3)+4*b-2*(a-b-3)+5;
```

```java
int a = 7;
int b = 20;
int c = 2 * (a - 3) + 4 * b - 2 * (a - b - 3) + 5;
```

-----------------------------------------------------------------------------

## Adding whitespace between statements

```java
if (age >= 60) {
  activateSeniorDiscount();
}
if (gender.equals("Female")) {
  provideFemaleShoes();
} else if (gender.equals("Male")) {
  provideMaleShoes();
}
```

```java
if (age >= 60) {
  activateSeniorDiscount();
}

if (gender.equals("Female")) {
  provideFemaleShoes();
} else if (gender.equals("Male")) {
  provideMaleShoes();
}
```

-----------------------------------------------------------------------------

# Why?

Why is this important? As far as your computer is concerned, it's not. Indenting your Java code won't alter it's behaviour, neither will adding spaces in between the plus operator, so why? Because you will read your code more often and more times than write it, and so we follow these style guides to make it easier for humans (including your future self) to read.

-----------------------------------------------------------------------------

# Homework

You're learning a lot and it's hard to remember everything, we understand. But we also understand that it takes a lot of practice to learn and remember everything you need in order to become an effective programmer, so this week we're going to assing more homework as a way to give you more chance to practice what you're learning.

-----------------------------------------------------------------------------

## What do we expect?

- We have example text output for each assignment; your program's output should look _exactly_ like ours.
- Follow the code style guides you learned today.
  - put brackets where needed
  - indent your code
  - add whitespace to add visual sections to your code
- Every assignment should be in a _separate file_ that is _ready to compile and run_ with no changes.

-----------------------------------------------------------------------------

# Additional resources

- Introduction: https://youtu.be/TBWX97e1E9g
- User input: https://youtu.be/yYN8u90MKCg
- Conditionals (if/else/switch): https://youtu.be/qZ2pb6BljLk
- Loops (for/while): https://youtu.be/efvZmFd1prA
- Methods: https://youtu.be/1HTsLK_m2ao
- Classes: https://youtu.be/rGlJiUO-dZA
- Logic behind programming and building a game: https://youtu.be/_pUz-GJcdRU, https://youtu.be/bQTFXlZWzKw
- Arrays and collections (ArrayList): https://youtu.be/eNPX2pTiaHI, https://youtu.be/IEqvmsqjpT0

-----------------------------------------------------------------------------

# Reference list
