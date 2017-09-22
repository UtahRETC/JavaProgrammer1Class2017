<!--
$theme: default
page_number: true
footer: Java Class - Class 4
-->

# What is a class?

A class is a blueprint which describes a container for specific data.  The simplest, and most useless, class contains no data.

```
class BoringAnimal
{
}
```
As shown above, to describe a class in code you need the `class` keyword followed by a name for that class.  In this case `BoringAnimal`. This "description" of a class is called the class definition and writing the definition is called defining the class.

-----------------------------------------------------------------------------

# Data in a class

The data contained within a class is represented by fields. A field is similar to a variable except that it is contained within, and belongs to, the class.

```
class Dog 
{
  String name = "Griz";
  int age = 5;
  String breed = "Rottweiler";
}
```
In the above example we define a class `Dog` which contains 3 fields: `name`, `age` and `breed`.

-----------------------------------------------------------------------------

# Field Definition Breakdown

The line `String name = "Griz";` from the previous example is known as a field definition. You can see that, just like a variable, there is a type `String` which indicates what type of data is in the field.  Then comes the name of the field `name`, an equals sign `=` indicating assignment and finally the actual data contained in the field `"Griz"`.

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
class FavoriteMovie
{
  String name = "Deadpool";
  int year = 2016;
  String genre = "Comedy";
}
```

-----------------------------------------------------------------------------

# Interacting with the data

In addition to containing data, a class may contain logic which interacts with that data. When contained within a class, this logic is called a method.

```
class Pet
{
  String type = "Dog";
  String trick = "Roll Over";

  void doTrick()
  {
    System.out.println(trick);
  }
}
```

-----------------------------------------------------------------------------

# Method Definition Breakdown
```
  void doTrick()
  {
    System.out.println(trick);
  }
```
The lines above from the previous example are collectively called a method definition.  Within a method definition there is the type signature `void doTrick()` and the body of the method 
```
{
  System.out.println(noise);
}
```

-----------------------------------------------------------------------------

# Type Signature Breakdown

In the type signature `void doTrick()` the word `void` indicates the return type.  The return type is what the method will send back when it is called.  In this case, we use the special keyword `void` which indicates that nothing will be returned.  
Type signatures can be much more complex than this, but that will be covered in a future class. 

-----------------------------------------------------------------------------

# Method Body Breakdown
```
{
  System.out.println(noise);
}
```
The left curly brace `{` starts the method body and the matching right curly brace `}` ends the method body.  Everything in between is the work done by the method. In this work to be done consists of printing the field named `noise`.

-----------------------------------------------------------------------------

# Method Exercise

Add a method to your movie class which will print each field on its own line.

-----------------------------------------------------------------------------

# Method Exercise Example

```
class FavoriteMovie
{
  String name = "Deadpool";
  int year = 2016;
  String genre = "Comedy";

  void printFields()
  {
    System.out.println(name);
    System.out.println(year);
    System.out.println(genre);
  }
}
```

-----------------------------------------------------------------------------

# Using a Class

Defining a class is only the first part of the process, next we need to use the class.  As discussed before, a class is only a blueprint for containing data.  Just like a blueprint of a house is used to make a real house, a class is used to make a real object.  Understanding the distinction between a class and an object is critical to understanding java.  

**class**: A blueprint for a data container. 
**object**: A usable instance of the data container described by a class. There can be more than one object created from a given class.

-----------------------------------------------------------------------------

# Class Instantiation

The process of creating an object from a class is called **instantiation**. 

```
class Pet
{
  String type = "Dog";
  String trick = "Roll Over";

  void doTrick()
  {
    System.out.println(trick);
  }
}
```
We can **instantiate** the class with the code:
```
Pet myPet = new Pet();
```
-----------------------------------------------------------------------------
# Instantiation Breakdown
```
Pet myPet = new Pet();
```
In the above example, `Pet` indicates that the variable named `myPet` contains an **instance** of our new class `Pet`.  After the equals sign there is the new keyword `new` followed by the name of the class we want to **instantiate** and a pair of parenthesis. Now we have an **instance** of the class Pet in the myPet variable.

-----------------------------------------------------------------------------

# Referencing Class Members

With an **instance** of our `Pet` class we can **reference** what the class contains.  The reference operator is the period `.`.  So to get access to the field `type` in our `Pet` class we simple take the variable name, follow it with a period then the field name.
```
System.out.println(myPet.type);
```
similarly we can **invoke** the method `doTrick` with
```
myPet.doTrick()
```
-----------------------------------------------------------------------------

#Stuff about compiling multiple classes and having multiple files on the classpath?

-----------------------------------------------------------------------------

# Instantiation Exercise

Instantiate your movie class from the previous examples and invoke your method to print out the data.

-----------------------------------------------------------------------------

- _A video students should watch_ by Someone https://andalinktotheresource.com

-----------------------------------------------------------------------------

# Reference list

1. Your citation, https://anditswebsite.com
