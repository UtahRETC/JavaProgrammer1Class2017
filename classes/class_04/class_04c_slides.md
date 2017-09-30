<!--
$theme: default
page_number: true
footer: Java Class - Class 4c
-->

# Part III - Brent Wenerstrom

- Numeric promotion
- casting

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

# Primitive Ranks

- Reference table for numeric promotion

|          | smaller | -> | -> | larger|
| -------- | ------- | -- | -- | ----- |
| Integral | `byte` | `short` | `int` | `long` |
| Floating | `float` | `double` |
| Other    | `char` | `int` |


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

# Definitions

- **class**: "blueprint" of object structure.
- **method**: block of code executable through its name.
- **object**: instance of class.
- **instantiation**: to create an object from class definition.
- **constructor**: initializing method within a class.
- **parameter**: receiving variable in a method definition
- **numeric promotion**: how Java unifies types before performing binary opterations
- **casting**: forcing a change of the evaluated type of a variable
- **binary operator**: mathematical mapping of two parameters to one (example: +)