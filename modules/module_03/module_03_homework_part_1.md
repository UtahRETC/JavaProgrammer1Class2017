# Module 3 Homework part 1

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

#### 1. Which of the following are true? (Choose all that apply)
```
public class Bunny
{
  public static void main(String[] args)
  {
    Bunny bun = new Bunny();
  }
}
```

1. Bunny is a class
1. bun is a class
1. main is a class
1. Bunny is a reference to an object
1. bun is a reference to an object
1. None of the above

---

### Write the following (Do not worry about the accuracy of any movie details.  You can make it all up if you want.)

1. Modify your Actor class to represent any person.

1. Modify your Movie class to include the main star, the writer and the production company. Use your updated person class to represent the Actor and the Writer and a new class to represent the production company.  Ensure the new class has at least a name field and appropriate constructor.
Then add a method to your movie to print all the information contained in the class.

1. Lastly write a main method which creates three Movie instances and calls each Movie's print method.

### Extra Credit

1. Create a new class which will represent an online movie catalog.  This catalog will contain at least 3 movies.  It should have a method to list all the movies in the catalog and method to "order" a movie.  The order method should print the name of the movie and the name of the main star.

1. Create a main method that expects 1 argument on the command line.  If this argument exactly matches the text "list" then the main method will invoke the list method on the catalog.  If the argument exactly matches one of the names of the movies in the catalog, the main method will invoke the order method. Otherwise it can print a message saying it did not understand the argument.
