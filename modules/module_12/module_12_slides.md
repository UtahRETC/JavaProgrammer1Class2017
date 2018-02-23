<!--
$theme: default
page_number: true
footer: Java Class - Modifiers and Inheritance
-->

# Modifiers and Inheritance

- **Review of Previous Week**
- **Access modifiers**
- **Final keyword**
- **Overloading**
- **Inheritance**
- **Overriding**

-----------------------------------------------------------------------------

# Review of Previous Week

TODO (Eric)

-----------------------------------------------------------------------------

# Access Modifiers

TODO (Eric)

-----------------------------------------------------------------------------

# The `final` Keyword

TODO (Eric)

-----------------------------------------------------------------------------

# Overloading

TODO (Andrew)

Outline:

- signature of a method
  - name
  - parameters
  - return type
- examples
- constructors can do it too

-----------------------------------------------------------------------------

# Inheritance

-----------------------------------------------------------------------------

## What does "inheritance" mean?

Classes can *derive* information from other classes.

We say a child class *inherits from* a parent class, or that it *extends* the parent class.

We use inheritance in code when we want a generic version of an idea, along with more specific versions of the idea.

-----------------------------------------------------------------------------

## Examples

- A *dog* is a more specific kind of *animal*
- A *Toyota Camry* is a more specific kind of *car*, which is a more specific kind of *vehicle*
- A *video game* is a more specific kind of *program*
- A *Java programmer* is a more specific kind of *person*!

-----------------------------------------------------------------------------

## Why do we want that in code?

- Lets us organize our code better, so we can understand it more easily
- Lets us reuse code, so we can write *less code* to do the same thing

-----------------------------------------------------------------------------

## The grammar

```java
   public    class   Animal {
// ^         ^       ^
// Access    Class   Name
// Modifier

   }

   public    class   Dog    extends  Animal {
// ^         ^       ^      ^        ^
// Access    Class   Name   Extends  Parent
// Modifier                          Class

   }
```

-----------------------------------------------------------------------------

## We can have more levels if we want!

```java
public class Vehicle {
  // ...
}

public class Car extends Vehicle {
  // ...
}

public class ToyotaCamry extends Car {
  // ...
}
```

-----------------------------------------------------------------------------

## What happens when we use inheritance?

The subclass inherits the functionality of the parent class, and then adds on to it.

```java
public class Animal {
  public void walk() {
    System.out.println("The animal is walking");
  }
}

public class Dog extends Animal {
  public void bark() {
    System.out.println("Bark!");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog spot = new Dog();
    
    spot.walk(); // Defined in the Animal class
    
    spot.bark(); // Defined in the Dog class
  }
}
```

-----------------------------------------------------------------------------

## The Object class

The very most basic class in Java

If your class does not say `extends`, then it still extends Object!

```java
public class Object {
  // ...
}
```

-----------------------------------------------------------------------------

## The animals example

- `Object`
- `Animal` implicitly extends `Object`
- `Dog` explicitly extends `Animal`

You could write this:

```java
public class Animal extends Object {
  // ...
}
```

But you don't need to, because Java does it for you. The result is the same.

-----------------------------------------------------------------------------

TODO: add more

-----------------------------------------------------------------------------

# Overriding

TODO (Andrew)

Overview:

- member hiding [See video](https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m8&clip=2&mode=live)
  - dangerous for fields!
- method overriding
  - based on the actual class, not the casting
  - good
  - We can add the `@Override` annotation to show that we mean to override something

-----------------------------------------------------------------------------

## The animal example

```java
public class Animal {
  public void walk() {
    System.out.println("The animal is walking");
  }
}

public class Dog extends Animal {
  public void bark() {
    System.out.println("Bark!");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog spot = new Dog();
    
    spot.walk(); // "The animal is walking"
    
    spot.bark(); // "Bark!"
  }
}
```

-----------------------------------------------------------------------------

## Overriding the `walk` method

```java
public class Dog extends Animal {

  @Override
  public void walk() {
    System.out.println("The dog is walking");
  }
  
  public void bark() {
    System.out.println("Bark!");
  }
}
```

-----------------------------------------------------------------------------

## The `@Override` annotation

This reminds everybody that we are overriding the original `walk` method with a different one.

Not required, but helpful.

```java
@Override // <-------
public void walk() {
  System.out.println("The dog is walking");
}
```

-----------------------------------------------------------------------------

## What will be the output now?

```java
public class Animal {
  public void walk() {
    System.out.println("The animal is walking");
  }
}

public class Dog extends Animal {

  @Override
  public void walk() {
    System.out.println("The dog is walking");
  }

  public void bark() {
    System.out.println("Bark!");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog spot = new Dog();
    spot.walk();
    spot.bark();
  }
}
```

-----------------------------------------------------------------------------

# Additional resources

- _A video students should watch_ by Someone https://andalinktotheresource.com

-----------------------------------------------------------------------------

# Reference list

1. Your citation, https://anditswebsite.com
