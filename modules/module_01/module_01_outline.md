# Java cert prep module (Week 1)

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

- **Hello World** (http://introcs.cs.princeton.edu/java/11hello/):
  - creating a file, compiling it and executing the program.
- **Input and Output**: Output should be covered by Hello World program. As for
  input, just modify the Hello World to take in their name to say "Hello, Name"
  instead of "Hello, World".
- **Practice**: experimenting with errors. Make sure students can somewhat
  read the compiler's output and have a basic understanding of what went wrong
  and maybe how to fix it. Even just knowing that that output is important is
  good enough for this first week -- be able to know what line and column
  number the problem is in and knowing to start there and move up (the lines.)
  - Take Hello World program and make changes to it so that it does not compile
  or run properly.
  - Have students look at error output to understand how to read those errors.
    The instructor would do this for everyone at first and then every student
    would try it on their own.
  - Make sure to include a run time error.
- **Introduce data types and variables** (http://introcs.cs.princeton.edu/java/12types/)
  - Go over `int`, `double`, `boolean`, `char`, and `String`.
  - Cover difference between a _declaration statement_ and an _assignment statement_.
  - Difference between a character and a string/int and double/etc.
  - String concatenation and arithmetic
    - Go over how the plus sign means different things depending on the context.
  - Comparisons
  - Boolean and boolean operations: and, or, not.
  - Casting a string to a number and a number to a string. Demonstrate how one
    can convert a double to an int and an int to a double and show loss of
    precision.

<div class="break"></div>

### Class Exercises

**Hello World**

```java
// prog/HelloWorld.java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

```bash
> javac HelloWorld.java
> java HelloWorld
```

1. Describe what happens if, in HelloWorld.java, you omit
  - main
  - String
  - HelloWorld
  - System.out
  - println
1. Describe what happens if, in HelloWorld.java, you omit
  - the ;
  - the first "
  - the second "
  - the first {
  - the second {
  - the first }
  - the second }
1. Describe what happens if, in HelloWorld.java, you misspell (by, say,
   omitting the second letter)
  - main
  - String
  - HelloWorld
  - System.out
  - println
1. I typed in the following program. It compiles fine, but when I execute it,
   I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?

```java
public class Hello {
  public static void main() {
    System.out.println("Doesn't execute");
  }
}
```

**Input and Output**

```java
// prog/HelloWorldWithArguments.java
public class HelloWorldWithArguments {
  public static void main(String[] args) {
    String name = "World";

    if (args.length > 0) {
      name = args[0];
    }

    System.out.println("Hello, " + name + "!");
  }
}
```

**Practice**

```java
// prog/CompileError1.java
public class CompileError1 {
  public static void main(String[] args) {
    System.out.prntln("This is a string");
  }
}
```

```bash
> javac CompileError1.java
CompileError1.java:3: error: cannot find symbol
    System.out.prntln("This is a string");
              ^
  symbol:   method prntln(String)
  location: variable out of type PrintStream
1 error
```

```java
// prog/RuntimeError1.java
public class RuntimeError1 {
  public static void main(string[] args) {
    system.out.println("i am " + args[0] + " years old");
  }
}
```

```bash
> javac RuntimeError1.java
> java RuntimeError1
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at RuntimeError1.main(RuntimeError1.java:3)
```

**Introduce data types and variables**

1. Why does 10/3 give 3 and not 3.33333333?
  - Solution: Since both 10 and 3 are integer literals, Java sees no need for
    type conversion and uses integer division. You should write 10.0/3.0 if you
    mean the numbers to be double literals. If you write 10/3.0 or 10.0/3, Java
    does implicit conversion to get the same result.
1. What do each of the following print?
  - <code>System.out.println(1 + 1);</code>
  - <code>System.out.println("1" + "1");</code>
  - <code>System.out.println(2 + "bc");</code>
  - <code>System.out.println(2 + 3 + "bc");</code>
  - <code>System.out.println((2+3) + "bc");</code>
  - <code>System.out.println("bc" + (2+3));</code>
  - <code>System.out.println("bc" + 2 + 3);</code>

### Homework

1. Day of the week. Write a program DayOfWeek.java that takes a date as input
   and prints the day of the week that date falls on. Your program should take
   three command-line arguments: m (month), d (day), and y (year). For m use 1
   for January, 2 for February, and so forth. For output print 0 for Sunday, 1
   for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the
   Gregorian calendar (where / denotes integer division):

```
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
```

<div class="break"></div>

## Resources

- http://introcs.cs.princeton.edu/java/home/
- http://introcs.cs.princeton.edu/java/11hello/
- http://introcs.cs.princeton.edu/java/12types/
- _Introduction and Setting up Your Environment_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m1&clip=0
- _Variables, Data Types, and Math Operators_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m3&clip=0
