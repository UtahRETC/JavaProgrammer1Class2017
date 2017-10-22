# Module 1 Homework (Part 1)

<style>
@media print {
  pre {
    border: 1px solid gray;
    page-break-inside: avoid;
  }
}

.break {
  page-break-after: always;
}
</style>

#### 1. Write the commands needed for the following questions

1. If I have a Java file named `HelloWorld.java`, how would I compile it?
1. After I compiled the file mention in the previous question, how can I execute it?

---

#### 2. Answer True or False

1. `2 == 2`
1. `1 > 1`
1. `2 >= 1`
1. `2 >= 2`
1. `2 >= 3`

---

#### 3. What do the following print?

1. `System.out.println(2 + "bc");`
1. `System.out.println(2 + 3 + "bc");`
1. `System.out.println((2+3) + "bc");`
1. `System.out.println("bc" + (2+3));`
1. `System.out.println("bc" + 2 + 3);`

#### 4. Describe what happens if, in HelloWorld.java, you omit
1. `main`
1. `String`
1. `HelloWorld`
1. `System.out`
1. `println`

---

#### 5. Describe what happens if, in HelloWorld.java, you omit
1. the `;`
1. the first `"`
1. the second `"`
1. the first `{`
1. the second `{`
1. the first `}`
1. the second `}`

---

#### 6. Describe what happens if, in HelloWorld.java, you misspell (by, say, omitting the second letter)
1. `main`
1. `String`
1. `HelloWorld`
1. `System.out`
1. `println`

<div class="break"></div>

#### 7. I typed in the following program. It compiles fine, but when I execute it, I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?

```java
public class Hello {
  public static void main() {
    System.out.println("Doesn't execute");
  }
}
```

What do I need to do to fix it?

---

#### 8. What is the result of the following program?

```java
public class Test {
  public static void main(String[] arg) {
    System.out.println(10.0 / 3.0);
    System.out.println(10 / 3.0);
    System.out.println(10.0 / 3.0);
    System.out.println(10 / 3);
  }
}
```

---

### Write the following programs

---

#### 9. Hello

Write a program that prints "Hello, my name is Marcos". Just make sure to use your name instead of mine.

---

#### 10. Data Types

Write a program that uses each of the data types that we presented in class.

---

#### 11. Operators

The program below is displaying the results for the result of a `>` operator. Do the same for the rest of the operators we covered in class.

The example below declared a variable and prints out the result in a human friendy way. You should do the same for the operators that you use. For example, when you add the `<` operator, declare a variable the holds the result and add a print statement detailing what was checked and what the result is.

```java
public class Operators {
  public static void main(String[] args) {
    boolean is5GreaterThan5 = 5 > 5;

    System.out.println("Is 5 greater than 5? " + is5GreaterThan5);
  }
}
```
