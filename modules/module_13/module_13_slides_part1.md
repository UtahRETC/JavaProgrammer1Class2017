# Outline
- Interfaces
- Abstract classes

---

# Interfaces
- Define a contract that a class must live by.
- A class may implement unlimited interfaces
  - May only inherit from one parent
- Allows customization of algorithm.

---

# Interface Example
``` java
public interface Runner extends CanMove {
  // constants
  int MAX_SPEED = 576;
  // method signatures
  void run();
}
```

- `class` replaced by `interface` keyword.
- Has attribute (generally should not).
- No method body.
- Access modifier? Default: `public`.
- Can inherit from another interface.

---

# Implementing an Interface
```java
public class Cheetah extends Animal implements Runner {
  public void run() {
    setSpeed(70);
    move(2.5);
  }
}
```
- Notice the keyword `implements`.

---

# Example 2: Old McDonald
```java
public interface OldMcDonald {
  String name();
  String speak();
}
```
```java
public class Dog extends Animal implements OldMcDonald {
  public String name() { 
    return "Dog";
  }
  
  public String speak() { 
    return "Bark";
  }
}
```

---

# Example 2 Continued
```java
public class OldMcDonaldSong {
  public void sing(List<OldMcDonald> animals) {
    for (OldMcDonald animal: animals) {
      System.out.println("...had a " + animal.name());
      System.out.println("...with a " + animal.speak());
    }
  }
}
```
```java
public class FarmAnimals {
  private List<Animal> animals = new ArrayList<Animal>();
  public FarmAnimals(List<Animal> animals) {
    animals.addAll(animals);
  }
}
```

---

# Abstract
<center><img src="convergence.jpg" height=650></center>

---

# Abstract Classes
- Does this make sense?
```java
Animal genericAnimal = new Animal();
```
- How do you prevent this?
  - `abstract`

---

# Abstract Example: Cannot be instantiated
```java
public abstract class Animal {
  public Animal() {
  }
}
```
```java
Animal a = new Animal();
```
```bash
error: Animal is abstract; cannot be instantiated
                Animal a = new Animal();
                           ^
1 error
```

---

# Inherited Fields
```java
public abstract class Animal {
  protected int age;
}
```
```java
public class Cat extends Animal {
  public void speakAge() {
    System.out.println("I am " + age + " years old");
  }
}
```
- Parent fields can be accessed as though they are part of the child.

---

# Inherited Fields: Trivia
```java
public abstract class Animal {
  protected int age;
}
```
```java
public class Hippo extends Animal {
  public Hippo(int a) {
    age = a;
  }
}
```
```java
Hippo happy = new Hippo(24);
Hippo sleepy = new Hippo(12);
```
- Is happy.age 12 or 24?
- What keyword would switch that?

---

# Abstract Methods
```java
public abstract class Animal {
  public abstract void speak();
}
```
- What does that look like?
- Why not just use an interface?

---

# Abstract Methods: Mixed
```java
public abstract class Animal {
  public abstract void speak();
  
  public void recitePoetry() {
    System.out.println("Two roads diverged in a ...");
  }
}
```
- Some methods implemented in parent.
- Some methods implemented in children.
- Can always override the parent methods.

---

# Real World Example: AbstractList
```java
public abstract class AbstractList<E> {
  abstract public void add(int index, E element);
  
  public boolean addAll(int index, Collection<E> c) {
    boolean modified = false;
    for (E e : c) {
      add(index++, e);
      modified = true;
    }
    return modified;
  }
}
```
- `addAll` same for each type of list.
- `add` method will vary. Implementation detail supplied by each child.
