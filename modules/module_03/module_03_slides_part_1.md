<!-- $theme: default
page_number: true
footer: Java Class - Module 3 (part 1)
-->
<style>
aside::before { 
    content: "Speaker notes:";
    font-weight: bold;
}
aside {
    width: 850px;
    border: 1px black solid;
    padding: 5px 5px 5px 5px;
    font-size: 12px;
    line-height: 15px;
    background-color: #EFEFEF;
    display: none;
    position: absolute;
    bottom: 15px;
}
</style>

# What is a class?

A class is a blueprint which describes a container for specific data.  

```
public class BoringAnimal
{
}
```
- class definition
  - `public` keyword
  - `class` keyword
  - class name `BoringAnimal`
  - body of the class

-----------------------------------------------------------------------------

# Data in a class

The data contained within a class is represented by fields. 

```
public class Dog 
{
  public String name = "Griz";
  public int age = 5;
  public String breed = "Rottweiler";
}
```
- field definition
  - `public` keyword
  - type
  - name
  - value
<aside>A field is similar to a variable except that it is contained within, and belongs to, the class.</aside>

-----------------------------------------------------------------------------

# Class Data Exercise 

Write a class definition which represents your favorite movie.  Include fields to contain:
- Name of the movie
- Year the movie was released
- Type of movie (Comedy, Action etc)

Make sure this class compiles with javac.

-----------------------------------------------------------------------------

# Class Data Exercise Example

```
public class FavoriteMovie
{
  public String name = "Deadpool";
  public int year = 2016;
  public String genre = "Comedy";
}
```

-----------------------------------------------------------------------------

# Interacting with the data

<aside>In addition to containing data, a class may contain logic which interacts with that data. </aside>Logic contained in a class is called a method.

```
public class Pet
{
  public String animalType = "Dog";
  public String trick = "Roll Over";

  public void doTrick()
  {
    System.out.println(trick);
  }
}
```

-----------------------------------------------------------------------------

# Method Definition Breakdown
```
  public void doTrick()
  {
    System.out.println(trick);
  }
```
- method definition
  - `public` keyword
  - type signature
  - method body

Note: Type signatures can be much more complex than this, but that will be covered in a future class. 
<aside>In the type signature `void doTrick()` the word `void` indicates the return type.  The return type is what the method will send back when it is called.  In this case, we use the special keyword `void` which indicates that nothing will be returned.</aside>
<aside>
The left curly brace `{` starts the method body and the matching right curly brace `}` ends the method body.  Everything in between is the work done by the method. In this work to be done consists of printing the field named `noise`.</aside>

-----------------------------------------------------------------------------

# Method Exercise

Add a method to your movie class which will print each field on its own line.

-----------------------------------------------------------------------------

# Method Exercise Example

```
public class FavoriteMovie
{
  public String name = "Deadpool";
  public int year = 2016;
  public String genre = "Comedy";

  public void printFields()
  {
    System.out.println(name);
    System.out.println(year);
    System.out.println(genre);
  }
}
```

-----------------------------------------------------------------------------

# Objects

<aside>Defining a class is only the first part of the process, next we need to use the class.  As discussed before, a class is only a blueprint for containing data.  Just like a blueprint of a house is used to make a real house, a class is used to make a real object.  </aside>

**class**: A blueprint for a data container. 
**object**: A usable instance of the data container described by a class. There can be more than one object created from a given class.

Understanding the distinction between a class and an object is critical to understanding java.  

-----------------------------------------------------------------------------

# Class Instantiation

The process of creating an object from a class is called instantiation. 

```
public class Pet
{
  public String animalType = "Dog";
  public String trick = "Roll Over";

  public void doTrick()
  {
    System.out.println(trick);
  }
}
```

-----------------------------------------------------------------------------
# Instantiation Breakdown
We can instantiate the class with the code:
```
Pet myPet = new Pet();
```
- instantiation
  - Type
  - name
  - `new` keyword
  - class name
  - parenthesis
<aside>`Pet` indicates that the variable named `myPet` contains an instance of our new class `Pet`.  After the equals sign there is the new keyword `new` followed by the name of the class we want to instantiate and a pair of parenthesis. Now we have an instance of the class Pet in the myPet variable.</aside>

-----------------------------------------------------------------------------

# Referencing Class Members

Field reference
```
System.out.println(myPet.animalType);
```

Invoking a method
```
myPet.doTrick()
```
<aside>The reference operator is the period `.`.  </aside>

-----------------------------------------------------------------------------

# Instantiation Exercise

Instantiate your movie class from the previous examples and invoke your method to print out the data.

-----------------------------------------------------------------------------

# Reference list

1. https://docs.oracle.com/javase/tutorial/java/javaOO/index.html
1. http://web.mit.edu/1.00/www/definitions.htm
