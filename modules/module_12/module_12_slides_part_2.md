<!--
$theme: default
page_number: true
footer: Java Class - Module 12
-->

# Module 12

- **Review of Previous Week**
- **Classes as types**
- **Constructors**
- **`instanceof`**
- **Casting**
- **`super`**
- **Polymorphism**
- **Additional resources**

-----------------------------------------------------------------------------

# Review of Previous Week

TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO
TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO TODO

-----------------------------------------------------------------------------

# Classes as types

-----------------------------------------------------------------------------

## Constructors

-----------------------------------------------------------------------------

### Review: what is a constructor?

Constructors are special methods that match the name (casing matters!) of the class and have no return type. The constructor method run only once, and that is when you "instanciate" the class.

-----------------------------------------------------------------------------

### Here's an example

```java
class HumanBeing {
  public HumanBeing() {
    System.out.println("A new HumanBeing is being
      created!");
  }
}

public class Main {
  public static void main(String[] args) {
    // Notice how I never explicitly call the class
    // constructor. Classes are instanciated using
    // the `new` keyword. When I do this, one of the
    // `HumanBeing` class constructors runs. I
    // should see "A new HumanBeing is being
    // created!" printed to the screen since that
    // code runs in the constructor for the HumanBeing
    // class.
    HumanBeing me = new HumanBeing();
  }
}
```

-----------------------------------------------------------------------------

### Remember

In order for a constructor to be valid, it must:

1. Have the exact name as the class. Case matters.
2. It cannot have a return type.

-----------------------------------------------------------------------------

### Question

Who can tell me (1) if the classes below have valid constructors and (2) if they are not, why they are not valid.

```java
public class Cat {
  public cat() {
    System.out.println("meow");
  }
}

public class Dog {
  public void Dog() {
    System.out.println("woff");
  }
}
```

-----------------------------------------------------------------------------

### Answer

```java
public class Cat {
  // The method below is not a constructor because the
  // class is named `Cat` this method is named `cat`.
  // One has an upper case C and the other has a lower
  // case c, and so they are different.
  public cat() {
    System.out.println("meow");
  }
}

public class Dog {
  // The method below is not a constructor because it
  // has a return type, `void` in thie case. Constructor
  // cannot have return types, and so this is not a
  // constructor.
  public void Dog() {
    System.out.println("woff");
  }
}
```

-----------------------------------------------------------------------------

## Can I have multiple constructors?

Yes! But why would I want that? Well, let's imagine a scenario where we might allow a user of our code (or us using our own code) to create a class and instanciate it with different sets of data? If we find we're in this situation, we can create multiple constructors in the same class with the help of a feature called "overloading."

-----------------------------------------------------------------------------

# New Terminology!

==**Overloading**==: Overloading allows me to create the same method in a class, but give each of those methods different parameters and different types for those parameters.

-----------------------------------------------------------------------------

### Here's an example

```java
class HumanBeing {
  protected String name;
  protected int age;

  public HumanBeing() {
    this.name = "Unknown Person";
    this.age = 0;
  }

  public HumanBeing(String name) {
    this.name = name;
    this.age = 0;
  }

  public HumanBeing(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```

-----------------------------------------------------------------------------

The previous class allows me to create a new `HumanBeing` in the following ways:

- `HumanBeing me = new HumanBeing();`
- `HumanBeing me = new HumanBeing("Marcos");`
- `HumanBeing me = new HumanBeing("Marcos", 72);`


A constructor will be picked depending on what parameters I use and what their types are.

-----------------------------------------------------------------------------

# Quiz time

Who can tell me what constructor runs when `me1` is instanciated? What about for `me2`? Why?

```java
public class Main {
  public static void main(String[] args) {
    HumanBeing me1 = new HumanBeing();
    HumanBeing me2 = new HumanBeing("Marcos"); } }

class HumanBeing {
  protected String name;
  protected int age;

  public HumanBeing() {
    this.name = "Unknown Person";
    this.age = 0; }

  public HumanBeing(String name) {
    this.name = name;
    this.age = 0; } }
```

-----------------------------------------------------------------------------

# `this`

-----------------------------------------------------------------------------

## `super`

-----------------------------------------------------------------------------

## `instanceof`

-----------------------------------------------------------------------------

# Casting

-----------------------------------------------------------------------------

# Polymorphism

-----------------------------------------------------------------------------

# Additional resources

- _A Closer Look at Parameters_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m7&clip=0&mode=live
- _Class Inheritance_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m8&clip=0&mode=live
