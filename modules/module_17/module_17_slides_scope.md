# Outline
- Scope
- Garbage Collection

---

# Scope
- Scope is about two things:
  - Access of variables.
  - Lifespan of variables.
- Variables are like mailboxes:
  - A place to store things.
  - At some point the name is removed and another name is put on the box.

---

# Scope Example: Lifespan of Inner Block Variable

```java
public static void main(String[] args) {
  if (3 < 5) {
    int x = 5; // <-- Variable created
    x = x + 3; // <-- Variable in scope
  } // <-- Variable lost from view
  int x = 37; // Completely different variable
}
```

---

# Scope Example: Inner Block Access

```java
public class Example2 {
  public static void main(String[] args) {
    int x = 5;                    // x->[ 5 ]
    for (int i = 0; i < 3; i++) { // |
      System.out.println(x);      // | Accessible
    }                             // V
  }                               // variable lost
}
```

- `x` is accessible inside the inner block.
- `{` and `}` define the block.

---

# Scope Example: Outer Block Loses Track

```java
public class Example3 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      int x = i;
    }
    System.out.println(x); // Will not compile
  }
}
```

- `x` will be created each time we run the loop.
- `x` is destroyed upon completion of the loop.
- No `x` available after the loop completes.

---

# Scope Example: Class Field

```java
public class Example4 {
  private int x = 5;
  
  public Example4() {
    System.out.println(x);
  }
}
```

```java
new Example4();
```

- `x` is accessible from any method in class `Example4`.
- `x` lives as long as an Example4 object exists.

---

# Scope Example: Method Scope

```java
public class Example5 {
  public Example5() {
    int x = 5;
  }
  
  public void print() {
    System.out.println(x); // Will not compile
  }
}
```

- `x` is gone at the end of the constructor.

---

# Scope Example: Class Global Again

```java
public class Example6 {
  public int x = 5;
  public Example6() {
    System.out.println(x);
  }
  
  public void printX() {
    System.out.println(x);
  }
}
```

- `x` is available to both the constructor and `printX` method.

---

# Scope Question

```java
public class Question {
  public static void main(String[] args) {
    int x = 5;
    while (x > 4) {
      // 1. x?
    }
    // 2. x?
  }
  
  public static printX() {
    // 3. x?
  }
}
```

- Where is `x` accessible?

---

# Scope Question 2

```java
public class Question2 {
  public static void main(String[] args) {
    while (x > 4) {
      int x = 5;
      // 1. x?
    }
    // 2. x?
  }
  
  public static printX() {
    // 3. x?
  }
}
```

---

# Garbage Collection

