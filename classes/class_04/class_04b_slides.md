<!--
$theme: default
page_number: true
footer: Java Class - Class 1
-->

# Part II

- Constructors
- Compiling multiple files
- Main
- Numeric promotion
- casting

-----------------------------------------------------------------------------

# Constructors

- Setup a class
- Entry point when using the keyword **new**

-----------------------------------------------------------------------------

# Constructor Example

```java
class Halloween
{
  String date;
  
  // Constructor
  Halloween()
  {
    date = "Oct 31st";
  }
}
```

-----------------------------------------------------------------------------

# Constructor with Parameters

- Each instance can have their own "personality"

```java
class Actor
{
  String name;
  
  // Constructor with parameter n
  Actor(String n)
  {
    name = n;
  }
  
  void speak()
  {
    System.out.println("Hi! My name is " + name);
  }
}
```

-----------------------------------------------------------------------------

# Constructor with Parameters (cont)

Create Actor instances and use them.
```java
Actor freeman = new Actor("Morgan Freeman");
Actor hanks = new Actor("Tom Hanks");

freeman.speak();
hanks.speak();
```

-----------------------------------------------------------------------------

# Costructor with Parameters (output)

```bash
$ java ActorExample
Hi! My name is Morgan Freeman
Hi! My name is Tom Hanks
```
- We could execute the same method and get different output
- This came because each instance held different values (personality)

-----------------------------------------------------------------------------

# Compile Multiple Files

- How would make the example work?

-----------------------------------------------------------------------------

# Compile Multiple Files Example

- Explicit way (my preference)

```bash
$ javac Actor.java ActorExample.java
```
-> Actor.class, ActorExample.class

-----------------------------------------------------------------------------

# Compile Multiple Files Example
- Use default to your advantage
```bash
$ javac ActorExample.java
```
-> Actor.class, ActorExample.class
- Last approach uses the default classpath of the current directory to find the Actor class and compile it.

-----------------------------------------------------------------------------

# Main method missing

```bash
$ java Actor
Error: Main method not found in class Actor, please 
define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend 
javafx.application.Application
```
- A class without a main cannot be run
- Main is built into the language and requires a precise definition

-----------------------------------------------------------------------------

# Main method

And now we can execute the Actor class

```java
class Actor
{
  String name;
  Actor(String n)
  {
    name = n;
  }
  
  public static void main(String[] args)
  {
    System.out.println("Actor class");
  }
}
```
```bash
$ java Actor
Actor class
```

----------------------------------------------------------------------------

# Numeric Promotion

- How does Java interpret the following expression:
```java
'a' + 2
```

----------------------------------------------------------------------------

# Numeric Promotion

- Java can only use basic operators when the operands are the same type
  - For example: `2.0 + 1.0`
- Java has specific rules about adjusting type before applying operands such +, -, /, *

----------------------------------------------------------------------------

# Numeric Promotion Rules

1. Promote smaller (in bytes) type to larger type
2. When mixing floating point and integral, promote integral to floating point
3. `byte`, `short` and `char` are promoted to `int` when part of operation
4. Output of expression is same type as operands

----------------------------------------------------------------------------

# Numeric Promotion Examples

What is the resulting type of the last expression?
```java
int x = 1;
long y = 33;
x * y;
```

Notes: Ugly way to find out the boxed type.
```java
((Object) (x * y)).getClass().getName();
```
Demo run with `java -jar bsh-2.0b4.jar`

----------------------------------------------------------------------------

# Numeric Promotion Examples

What is the resulting type of the last expression?
```java
double x = 39.21;
float y = 2.1;
x + y;
```

----------------------------------------------------------------------------

# Answer

Trick question answer
```bash
Fail.java:6: error: incompatible types: possible lossy 
conversion from double to float
		float y = 2.1;
		          ^
1 error
```

----------------------------------------------------------------------------

# Numeric Promotion Examples

What is the resulting type of the last expression?
```java
short x = 10;
short y = 3;
x / y;
```

----------------------------------------------------------------------------

# Numeric Promotion Examples

What is the resulting type of the last expression?
```java
short x = 14;
float y = 13;
double z = 30;
x * y / z;
```

----------------------------------------------------------------------------

# Answer
`x`: `short` -> `int` -> `float`
`x * y`: `float` -> `double`
`x * y / z`: `double`

----------------------------------------------------------------------------

# Casting

- How to force numeric type change

Example:
```java
System.out.println(2 / 3);
```

----------------------------------------------------------------------------

# Casting

```java
2 / 3;
```
Sometimes we want to convert a type before math:
```java
int x = 2;
int y = 3;
(float) 2 / 3;
```

----------------------------------------------------------------------------

# Casting with Classes

Contrived example:
```java
Object o = "abc";
o.length();
```
```bash
$ javac Fail.java
Fail.java:8: error: cannot find symbol
		System.out.println(o.length());
		                    ^
  symbol:   method length()
  location: variable o of type Object
1 error
```

----------------------------------------------------------------------------

# Casting with Classes

Fixed example:
```java
Object o = "abc";
System.out.println( ((String)o).length() );
```
```bash
$ javac Fail.java
3
```

Casting objects will make more sense when we have more class types and hierarchies to talk about.

----------------------------------------------------------------------------