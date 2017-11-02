# Module 05 Homework

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

### Quiz Questions (Move these into Canvas)

1. What is the correct way to check if these two numbers are equal?

```java
int x = 5;
int y = 6;
```

- `x == y`
- `x.equals(y)`

2. What is the correct way to check if the contents of these two strings are the same?

```java
String x = 'Red';
String y = 'Blue';
```

- `x == y`
- `x.equals(y)`

3. What is the correct way to check if these two strings point to the same location in memory?

```java
String x = 'Red';
String y = x;
```

- `x == y`
- `x.equals(y)`

4. ...

---

### Code Questions (Move these into files and reference them from here)

#### 1. Complete the following program:

```java
public class HomeworkSorting {
  public static void main(String[] args) {
    String[] animals = { "dog", "armadillo", "cat", "elephant", "baboon" };

    // TODO: sort the animals alphabetically

    // TODO: print out the animals on one line, with commas in between
  }
}
```

#### 2. Complete the following program:

```java
public class HomeworkWordCounts {
  public static void main(String[] args) {
    String[] items = { "pencil", "paper", "computer", "whiteboard", "backpack" };

    // TODO: get the number of letters for each word using the letterCounts method

    // TODO: print out the letter counts, one line at a time
  }

  public static int[] letterCounts(String[] words) {
    // TODO: implement this method
  }
}
```

#### 3. Complete the following program:

```java
public class HomeworkMovies {
  public static void main(String[] args) {
    String searchTitle = args[0];
    Movie[] movies = getMovies();

    // TODO: search through each movie to see if its title matches searchTitle

    // TODO: if a movie's title matches, print its info, using the getInfo() method

    // TODO: if no movies match the user input
  }

  public Movie[] getMovies() {
    Movie starWars = new Movie();
    starWars.setTitle('Star Wars');
    starWars.setGenre('Science Fiction');

    // TODO: define a few of your favorite movies here!
    // You can use http://www.imdb.com/ for info.

    Movie[] movies = { starWars8 };
    return movies;
  }
}

class Movie {
  private String title;
  private String genre;
  private int year;

  // TODO: Define getter and setter methods for each of the above fields

  /**
   * Returns info about a Movie as a String.
   *
   * For example:
   *
   * Star Wars
   * Genre: Science Fiction
   * Released: 1977
   */
  public String getInfo() {
    // TODO: implement this method
  }
}
```

---