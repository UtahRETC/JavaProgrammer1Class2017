# Java cert prep class (Module N)

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

- **We are going to cover this**: and here is some more information about it
  - and even more here

<div class="break"></div>

### Class Exercises

**Hello World code samples**

```java
// HelloWorld.java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

Students should type this into their editors and compile and execute using the
commands below.

```bash
> javac HelloWorld.java
> java HelloWorld
```

**Here are some review questions for the end of class:**

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

- additonal resources for the instructor and the students
- http://introcs.cs.princeton.edu/java/home/
