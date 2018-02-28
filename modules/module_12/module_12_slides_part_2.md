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

-----------------------------------------------------------------------------

Constructors are special methods that match the name (casing matters!) of the class and have no return type. Here's an example:

```java
public class HumanBeing {
  public HumanBeing() {
    System.out.println("A new HumanBeing is being created!");
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
  // The method below is not a constructor because the class is named `Cat`
  // this method is named `cat`. One has an upper case C and the other has a
  // lower case c, and so they are different.
  public cat() {
    System.out.println("meow");
  }
}

public class Dog {
  // The method below is not a constructor because it has a return type,
  // `void` in thie case. Constructor cannot have return types, and so this is
  // not a constructor.
  public void Dog() {
    System.out.println("woff");
  }
}
```

-----------------------------------------------------------------------------

### `super`

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
