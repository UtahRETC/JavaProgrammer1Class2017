<!--
$theme: default
page_number: true
footer: Java Class - Review 1
-->

# Review 1 (Modules 1 - 5)

- **Variables**
- **Arrays**
- **Control structures**
- **Class properties**
- **Class methods**
- **Class constructors**
- **Projects**

-----------------------------------------------------------------------------

# Variables

```java
String myName = "Marcos Minond";
boolean isAlive = true;
int age = 92;
```

-----------------------------------------------------------------------------

# Arrays

```java
String[] friends = {
  "Abdikadir",
  "Abdirahman",
  "Abdullah",
  "Ali",
  "Ali",
  "Benahin",
  "Garroe",
  "Indrias",
  "Khem",
  "Matios",
  "Mohamed ",
  "Mohammed",
  "Passy",
  "Patrick",
  "Tamrat"
};
```

-----------------------------------------------------------------------------

# Working with arrays

```java
System.out.println(friends[0]);     // "Abdikadir"
System.out.println(friends[1]);     // "Abdirahman"
System.out.println(friends.length); // 15
```

-----------------------------------------------------------------------------

# Control structures

-----------------------------------------------------------------------------

# `if`

```java
if (conditional) {
  // body
}
```

-----------------------------------------------------------------------------

# `if/else`

```java
if (conditional) {
  // body
} else {
  // body
}
```

-----------------------------------------------------------------------------

# `if/else if/else`

```java
if (conditional) {
  // body
} else if (conditional) {
  // body
} else if (conditional) {
  // body
} else if (conditional) {
  // body
} else {
  // body
}
```

-----------------------------------------------------------------------------

# `for`

```java
for (initialize; check; increment) {
  // body
}
```

-----------------------------------------------------------------------------

# Class properties

```java
class Movie {
  String title;
  int releaseYear;
}

public class MovieRunner {
  public static void main(String[] args) {
    Movie starWars = new Movie();
    starWars.title = "Star Wars";
    starWars.releaseYear = 1977;
  }
}
```

-----------------------------------------------------------------------------

# Class methods

-----------------------------------------------------------------------------

```java
class Movie {
  String title;
  int releaseYear;

  String getMovieInformation(String greeting) {
    return greeting + ", " + title + " was released in "
      + releaseYear;
  }
}

public class MovieRunner {
  public static void main(String[] args) {
    Movie starWars = new Movie();
    starWars.title = "Star Wars";
    starWars.releaseYear = 1977;

    String info = starWars.getMovieInformation();
    System.out.println(info);
  }
}
```

-----------------------------------------------------------------------------

# Class constructors

-----------------------------------------------------------------------------

```java
class Movie {
  String title; int releaseYear;

  Movie(String t, int r) {
    title = t;
    releaseYear = r;
  }

  String getMovieInformation(String greeting) {
    return greeting + ", " + title + " was released in "
      + releaseYear;
  }
}

public class MovieRunner {
  public static void main(String[] args) {
    Movie starWars = new Movie("Star Wars", 1977);
    String info = starWars.getMovieInformation("Hello");
    System.out.println(info);
  }
}
```

-----------------------------------------------------------------------------

# Projects

-----------------------------------------------------------------------------

# Additional resources (1/3)

- _Control structures_: http://www.dcs.ed.ac.uk/teaching/cs1/CS1/Ah/Notes/JavaControl.pdf
- _Control structures_: https://en.wikiversity.org/wiki/Java_Tutorial/Control_Structures_I_-_Decision_structures
- _Control structures_: https://www.slideshare.net/Ravi_Kant_Sahu/control-structures-in-java


-----------------------------------------------------------------------------

# Additional resources (2/3)

- _Variables, Data Types, and Math Operators_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m3&clip=0
- _Conditional Logic, Looping, and Arrays_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m4&clip=0&mode=live

-----------------------------------------------------------------------------

# Additional resources (3/3)

- _Representing Complex Types with Classes_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m5&clip=0&mode=live
- _Class Initializers and Constructors_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m6&clip=0&mode=live
- _A Closer Look at Parameters_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m7&clip=0&mode=live
