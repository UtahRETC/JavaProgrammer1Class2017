# Documentation

We just talked about using Java code written by others.

- What do we import?
- What methods do we call?
- What do those methods do?

---

# What to Import: Answer

I want to import `SoundbankReader`. Write the import statement.
![100%](midi.png)

```java
import javax.sound.midi.spi.SoundbankReader;
```

---

# Integer Class

What is this class good for?

![100%](integer_description.png)

---

# Public Fields

How would you print out the largest possible Integer?

![100%](integer_fields.png)

```java
System.out.println(Integer.MAX_VALUE);
```

---

# Constructors

How is each constructor called?

![100%](integer_constructors.png)

```java
Integer intNum = new Integer(3);
Integer intStr = new Integer("12");
Integer fail = new Integer("fail"); // What will happen?
```

---

# Methods

How would you get the float value from an `Integer` (without casting)?

![100%](integer_float.png)

```java
Integer intObj = new Integer(45);
float f = intObj.floatValue();
```

---

# Methods

How is `parseInt` called? What type is returned?

![100%](integer_parseint.png)

```java
int i = Integer.parseInt("3");
```

