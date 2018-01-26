# Module Outline

<title>Module Outline</title>

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

### Todo

- [x] List all sections
- [x] Make module outline
- [x] Put those sections into module outline
- [ ] Find questions for every section/class/week
- [ ] Find resources (Pluralsight videos are an option) for every section/class/week
- [ ] Slides


<div class="break"></div>

### Modules

Note that this particular order is not what we ended up following 100% of the time.

1. Hello, World
2. Variables, conditionals, and loops
3. Classes and instances
4. Methods, fields, and encapsulation
5. Arrays, strings, and references
6. Project 1 and introduction to git
7. Packages, imports, and conflicts
8. ArrayList deep dive and introduction to reading the docs
9. StringBuilder deep dive and String pool
10. Working with Dates and Times
11. Project 2
12. Classes deep dive, initializing blocks and static
13. Overloading, access modifiers, inheritance, overriding, and final
14. Abstract classes, interfaces, casting
15. Project 3
16. Exceptions
17. Lambdas, scopes, garbage collector
19. Project 4
20. Test reviews


### These are things that are not in the outline right now but probably should be

1. Build an HTTP api
2. Learn how to search on Google and Stack Overflow
3. More Git commands


### Ideas for future projects

- https://www.reddit.com/r/learnprogramming/comments/176iwa/i_give_you_the_best_200_assignments_i_have_ever/
- https://introcs.cs.princeton.edu/java/assignments/
- https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-189-a-gentle-introduction-to-programming-using-python-january-iap-2011/assignments/
- https://www.eduonix.com/courses/Software-Development/Learn-Projects-in-Java-for-Beginners-from-Scratch


### Outline

- Leftovers:
  - **The following book sections are not included in any of the classes below**:
    - Passing data among methods (ch. 4, page 188)
    - Encapsulating data and immutable classes (ch. 4, page 205, 207)

- Module 1:
  - Hello, World
  - Input and output
  - Reading compiler output
  - Basics of variables
  - Data types
  - Operators
  - **Book sections**:
    - Variables (ch. 1, page 25)
    - Basic syntax and data types
      - Comments (ch. 1, page 4)
    - Operators (ch. 2, page 52)
      - Arithmetic operators (ch. 2, page 53)
      - Unary operators (ch. 2, page 57)
        - Increment and decrement operators (ch. 2, page 58)
      - Assignment operator (ch. 2, page 60)
      - Compound assignment operators (ch. 2, page 62)
      - Relational operatos (ch. 2, page 63)
      - Equality operators (ch. 2, page 65)
  - **Left out (resolved)**:
      - Numeric promition, casting (ch. 2, page 55)
      - Ignoring `instanceof` operator. Teach this on one of the classes were Classes are taught?
        - Move this to Module 3
      - Logical operators (ch. 2, page 57)
        - Move this to Module 2
  - **Additional resources**:
    - _Introduction and Setting up Your Environment_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m1&clip=0
    - _Variables, Data Types, and Math Operators_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m3&clip=0

- Module 2:
  - Valid variable names and declaring, and initialization
  - Conditionals (`if`, `if-then`, `if-then-else`, `switch`)
  - Loops (`while`, `do-while`, `for`, `break`, `continue`, labels)
  - Left over from Module 1
  - **Book sections**:
    - Left over from Module 1
      - Logical operators (ch. 2, page 57)
        - Move this to Module 2
    - Variables (ch. 1, page 25)
      - Valid names, identifiers (ch. 1, page 27)
      - Declaring variables (ch. 1, page 25)
      - Understanding initialization of variables (ch. 1, page 29)
    - Control flow (ch. 2, page 86)
      - Nested loops (ch. 2, page 87)
      - Labels (ch. 2, page 87)
      - `break` statement (ch. 2, page 88)
      - `continue` statement (ch. 2, page 90)
    - Statements (ch. 2)
      - `if-then` statements (ch. 2, page 67)
      - `if-then-else` statements (ch. 2, page 68)
      - `switch` statement (ch. 2, page 72)
      - `while` statement (ch. 2, page 76)
      - `do-while` statement (ch. 2, page 78)
      - `for` statement (ch. 2, page 80)
  - **Additional resources**:
    - _Conditional Logic, Looping, and Arrays_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m4&clip=0&mode=live

- Module 3:
  - Classes
  - Objects
  - Constructors
  - Instances
  - Left over from Module 1
  - **Book sections**:
    - Left over from Module 1
      - Numeric promition, casting (ch. 2, page 55)
      - Ignoring `instanceof` operator. Teach this on one of the classes were Classes are taught?
    - Classes (ch. 1)
      - Main method basics (ch. 1, page 6)
      - Fields (ch. 1)
        - Reading and writing to object fields (ch. 1, 18)
      - Methods (ch. 1)
        - Constructors (ch. 1, page 17)
        - Finalize (ch. 1, page 38)
      - Classes vs files (ch. 1, page 5)
      - Variables (ch. 1, page 25)
        - Instance vs local vs class variables (ch. 1, page 29, 30)
  - **Additional resources**:
    - _Representing Complex Types with Classes_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m5&clip=0&mode=live
    - _Class Initializers and Constructors_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m6&clip=0&mode=live

- Module 4
  - Methods
  - Fields
  - Encapsulation
  - Main
  - **Book sections**:
    - Parts of a method (ch. 4, page 165)
      - Method optional specifiers (ch. 4, page 166)
      - Return type (ch. 4, page 169)
      - Method name (ch. 4, page 170)
      - Parameter list (ch. 4, page 171)
      - Exception list (ch. 4, page 171)
      - Method body (ch. 4, page 171)
  - **Additional resources**:
    - _A Closer Look at Parameters_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m7&clip=0&mode=live

- Module 5:
  - Arrays
  - Strings
  - Difference between object references and primitives
  - Difference between value equality and indentity equality
  - Wrapper classes
  - Varargs
  - **Book sections**:
    - Arrays (ch. 3, page 119 - 123)
      - Sorting (ch. 3, page 124)
      - Searching (ch. 3, page 125)
      - Varargs (ch. 3, page 126)
      - Multidimensional arrays (ch. 3, page 126)
      - `ArrayList` (ch. 3, page 129 - 138)
      - Converting array and List (ch. 3, page 136)
    - Strings (ch. 3, page 102)
      - Concatenation (ch. 3, page 103)
      - Method chaining (ch. 3, page 110)
    - Wrapper classes and autoboxing (ch. 3, page 134 - 136)
    - Understand equality (ch. 3, page 117)
    - Basic syntax and data types
      - Difference between object references and primitives (ch. 1, page 20)
    - Varargs (ch. 4, page 172)

- Module 6:
  - Introduction to Git
  - Create a github account
  - Close base project repo
  - Students should push projects to github
  - **Project outline**: use control flows, arrays and other different data
    types, and classes

- Module 7:
  - Packages
  - Creating packages
  - Imports
  - Naming conflicts
  - **Book sections**:
    - Packages (ch. 1, page 9)
      - Order of elements in file or in class (ch. 1, page 34)
      - Declarations (ch. 1, page 13)
      - Imports (ch. 1, page 9)
        - Wildcards (ch. 1, page 10)
        - Redundant imports (ch. 1, page 11)
        - Naming conflicts (ch. 1, page 12)
        - Creating a new package (ch. 1, page 13)
        - Code formatting trickery (ch. 1, page 16)
      - Static imports (ch. 4, page 187)
  - **Additional resources**:
    - _Working with Packages_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m11&clip=0&mode=live

- Module 8:
  - Looking up documentation and how to read it, using `ArrayList` as an example
  - `ArrayList` deep dive
  - Difference between Arrays and ArrayLists
  - **Book sections**:
    - Arrays (ch. 3, page 119 - 123)
      - `ArrayList` (ch. 3, page 129 - 138)

- Module 9:
  - `StringBuilder` deep dive
  - String pool
  - **Book sections**:
    - Strings (ch. 3, page 102)
      - Concatenation (ch. 3, page 103)
      - Immutability (ch. 3, page 104)
      - The string pool (ch. 3, page 105)
      - Key string methods (ch. 3, page 105)
      - `StringBuilder` class and important methods (ch. 3, page 111 - 114)
      - `StringBuilder` vs `StringBuffer` (ch. 3, page 117)
  - **Additional resources**:
    - _More About Data Types_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m9&clip=0&mode=live

- Module 10:
  - Working with Dates and Times
  - **Book sections**:
    - Dates and times (ch. 3, page 138)
      - Manipulating dates and times (ch. 3, page 142)
      - Working with periods (ch. 3, page 145)
      - Formatting dates and times (ch. 3, page 148)
      - Parsing dates and times (ch. 3, page 151)

- Module 11:
  - **Project outline**: use Dates, Times, and ArrayLists

- Module 12:
  - Classes deep dive
  - Instance initializing blocks
  - Static initializing blocks
  - Static methods
  - Static fields
  - **Book sections**:
    - Instance and static initializer blocks and their order (ch. 1, page 18, 19, 186)
    - Access modifiers (ch. 4, page 173)
      - Static methods (ch. 4, page 181)
      - Static variables (ch. 4, page 185)
      - Calling static methods and fields (ch. 4, page 182)
      - Static vs instance (ch. 4, page 183)
  - **Additional resources**:
    - _Class Initializers and Constructors_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m6&clip=0&mode=live
    - _Static Members, Nested Types, and Anonymous Classes_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m13&clip=0&mode=live

- Module 13:
  - Overloading
  - Access modifiers
  - Inheritance
  - Overriding
  - Final keyword
  - **Book sections**:
    - Inheritance (ch. 5, page 234)
      - Extending classes (ch. 5, page 235)
      - Applyting access modifiers (ch. 5, page 237)
      - Creating objects (ch. 5, page 237)
      - Defining constructors (ch. 5, page 238)
      - Inherited members, methods and variables (ch. 5, page 244 - 257)
    - Final fields (ch. 4, page 202)
    - Overloading methods (ch. 4, page 191)
    - Access modifiers (ch. 4, page 173)
      - Private (ch. 4, page 173)
      - Default, package private (ch. 4, page 175)
      - Protected (ch. 4, page 176)
      - Public (ch. 4, page 180)
    - More on constructors (ch. 4, page 196)
      - Default constructor (ch. 4, page 197)
      - Overloading constructors (ch. 4, page 199)
      - Order of initialization (ch. 4, page 202)
  - **Additional resources**:
    - _A Closer Look at Parameters_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m7&clip=0&mode=live
    - _Class Inheritance_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m8&clip=0&mode=live

- Module 14:
  - Abstract classes
  - Interfaces
  - Casting
  - Polymorphic parameters
  - Virtual methods
  - **Book sections**:
    - Abstract classes (ch. 5, page 259)
      - Defining abstract classes (ch. 5, page 260)
      - Creating concrete classes (ch. 5, page 262)
      - Extending abstract classes (ch. 5, page 263)
    - Interfaces (ch. 5, page 266)
      - Defining interfaces (ch. 5, page 267)
      - Inheriting an interface (ch. 5, page 269)
      - Default interface methods (ch. 5, page 274)
      - Static interface methods (ch. 5, page 278)
    - Understanding polymorphism (ch. 5, page 279)
      - Object vs. reference (ch. 5, page 281)
      - Casting objects (ch. 5, page 282)
      - Virtual methods (ch. 5, page 284)
      - Polymorphic parameters (ch. 5, page 285)
      - Polymorphism and method overriding (ch. 5, page 287)
  - **Additional resources**:
    - _Creating Abstract Relationships with Interfaces_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m12&clip=0&mode=live

- Module 15:
  - **Project outline**: use classes, inheritance, polymorphism, method
    overriding, Overloading, and initialization blocks

- Module 16:
  - Exceptions
  - What their role is
  - `try-catch` blocks
  - Throwing exceptions
  - `finally` blocks
  - Different types of exceptions: Runtime, Checked, Errors
  - **Book sections**:
    - Exceptions (ch. 6, page 300)
      - The role of exceptions (ch. 6, page 300)
      - Exceptions types (ch. 6, page 302)
      - Throwing exceptions (ch. 6, page 304)
      - `try` statements (ch. 6, page 305)
      - `finally` blocks (ch. 6, page 307)
      - Catching various types of exceptions (ch. 6, page 309)
      - Throwing a second exception (ch. 6, page 311)
      - Recognizing common exception types (ch. 6, page 313)
        - Runtime exceptions (ch. 6, page 314)
        - Checked exceptions (ch. 6, page 317)
        - Errors (ch. 6, page 317)
      - Calling methods that throw exceptions (ch. 6, page 318)
      - Exceptions in subclasses (ch. 6, page 319)
      - Printing exceptions (ch. 6, page 321)
  - **Additional resources**:
    - _Exceptions and Error Handling_ by Jim Wilson https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m10&clip=0&mode=live

- Module 17:
  - Lambdas
  - Scopes
  - Garbage collection
  - finalize methods
  - **Book sections**:
    - Object destruction and garbage collector (ch. 1, page 36)
    - Variables (ch. 1, page 25)
      - Scope (ch. 1, page 31)
    - Lambdas (ch. 4, page 208)
      - Syntax (ch. 4, page 211)
      - Predicates (ch. 4, page 214)

- Module 18:
  - **Project outline**: use exceptions

- Module 19, 20, 21, 22:
  - Reviews and practice tests
  - **Book sections**:
    - Review (appx. A, page 333)
      - Java building blocks (appx. A, page 334)
      - Operators and statements (appx. A, page 336)
      - Core java APIs (appx. A, page 339)
      - Methods and encapsulation (appx. A, page 342)
      - Class design (appx. A, page 346)
      - Exceptions (appx. A, page 349)
    - Study tips (appx. B, page 353 - 366)


<div class="break"></div>

### Sections

- basic syntax and data types
  - difference between object references and primitives (ch. 1, page 20)
  - comments (ch. 1, page 4)
  - assignment operator (ch. 2, page 60)
  - compound assignment operators (ch. 2, page 62)
  - relational operatos (ch. 2, page 63)
  - logical operators (ch. 2, page 64)
  - equality operators (ch. 2, page 65)
- statements (ch. 2)
  - if-then statements (ch. 2, page 67)
  - if-then-else statements (ch. 2, page 68)
  - switch statement (ch. 2, page 72)
  - while statement (ch. 2, page 76)
  - do-while statement (ch. 2, page 78)
  - for statement (ch. 2, page 80)
- control flow (ch. 2, page 86)
  - nested loops (ch. 2, page 87)
  - labels (ch. 2, page 87)
  - break statement (ch. 2, page 88)
  - continue statement (ch. 2, page 90)
- variables (ch. 1, page 25)
  - valid names, identifiers (ch. 1, page 27)
  - declaring variables (ch. 1, page 25)
  - scope (ch. 1, page 31)
  - understanding initialization of variables (ch. 1, page 29)
  - instance vs local vs class variables (ch. 1, page 29, 30)
- operators (ch. 2, page 52)
  - arithmetic operators (ch. 2, page 53)
  - numeric promition, casting (ch. 2, page 55)
  - unary operators (ch. 2, page 57)
    - logical operators (ch. 2, page 57)
    - increment and decrement operators (ch. 2, page 58)
- classes (ch. 1)
  - main method basics (ch. 1, page 6)
  - fields (ch. 1)
    - reading and writing to object fields (ch. 1, 18)
  - methods (ch. 1)
    - constructors (ch. 1, page 17)
    - finalize (ch. 1, page 38)
  - classes vs files (ch. 1, page 5)
  - instance and static initializer blocks and their order (ch. 1, page 18, 19, 186)
- object destruction and garbage collector (ch. 1, page 36)
- packages (ch. 1, page 9)
  - order of elements in file or in class (ch. 1, page 34)
  - declarations (ch. 1, page 13)
  - imports (ch. 1, page 9)
    - wildcards (ch. 1, page 10)
    - redundant imports (ch. 1, page 11)
    - naming conflicts (ch. 1, page 12)
    - creating a new package (ch. 1, page 13)
    - code formatting trickery (ch. 1, page 16)
- strings (ch. 3, page 102)
  - concatenation (ch. 3, page 103)
  - immutability (ch. 3, page 104)
  - the string pool (ch. 3, page 105)
  - key string methods (ch. 3, page 105)
  - method chaining (ch. 3, page 110)
  - `StringBuilder` class and important methods (ch. 3, page 111 - 114)
  - `StringBuilder` vs `StringBuffer` (ch. 3, page 117)
- arrays (ch. 3, page 119 - 123)
  - sorting (ch. 3, page 124)
  - searching (ch. 3, page 125)
  - varargs (ch. 3, page 126)
  - multidimensional arrays (ch. 3, page 126)
  - `ArrayList` (ch. 3, page 129 - 138)
  - converting array and List (ch. 3, page 136)
- wrapper classes and autoboxing (ch. 3, page 134 - 136)
- understand equality (ch. 3, page 117)
- dates and times (ch. 3, page 138)
  - manipulating dates and times (ch. 3, page 142)
  - working with periods (ch. 3, page 145)
  - formatting dates and times (ch. 3, page 148)
  - parsing dates and times (ch. 3, page 151)
- parts of a method (ch. 4, page 165)
  - method optional specifiers (ch. 4, page 166)
  - return type (ch. 4, page 169)
  - method name (ch. 4, page 170)
  - parameter list (ch. 4, page 171)
  - exception list (ch. 4, page 171)
  - method body (ch. 4, page 171)
- varargs (ch. 4, page 172)
- access modifiers (ch. 4, page 173)
  - private (ch. 4, page 173)
  - default, package private (ch. 4, page 175)
  - protected (ch. 4, page 176)
  - public (ch. 4, page 180)
  - static methods (ch. 4, page 181)
  - static variables (ch. 4, page 185)
  - calling static methods and fields (ch. 4, page 182)
  - static vs instance (ch. 4, page 183)
- static imports (ch. 4, page 187)
- passing data among methods (ch. 4, page 188)
- overloading methods (ch. 4, page 191)
- more on constructors (ch. 4, page 196)
  - default constructor (ch. 4, page 197)
  - overloading constructors (ch. 4, page 199)
  - order of initialization (ch. 4, page 202)
- final fields (ch. 4, page 202)
- encapsulating data and immutable classes (ch. 4, page 205, 207)
- lambdas (ch. 4, page 208)
  - syntax (ch. 4, page 211)
  - predicates (ch. 4, page 214)
- inheritance (ch. 5, page 234)
  - extending classes (ch. 5, page 235)
  - applyting access modifiers (ch. 5, page 237)
  - creating objects (ch. 5, page 237)
  - defining constructors (ch. 5, page 238)
  - inherited members, methods and variables (ch. 5, page 244 - 257)
- abstract classes (ch. 5, page 259)
  - defining abstract clasess (ch. 5, page 260)
  - creating concrete classes (ch. 5, page 262)
  - extending abstract classes (ch. 5, page 263)
- interfaces (ch. 5, page 266)
  - defining interfaces (ch. 5, page 267)
  - inheriting an interface (ch. 5, page 269)
  - default interface methods (ch. 5, page 274)
  - static interface methods (ch. 5, page 278)
- understanding polymorphism (ch. 5, page 279)
  - object vs. reference (ch. 5, page 281)
  - casting objects (ch. 5, page 282)
  - virtual methods (ch. 5, page 284)
  - polymorphic parameters (ch. 5, page 285)
  - polymorphism and method overriding (ch. 5, page 287)
- exceptions (ch. 6, page 300)
  - the role of exceptions (ch. 6, page 300)
  - exceptions types (ch. 6, page 302)
  - throwing exceptions (ch. 6, page 304)
  - `try` statements (ch. 6, page 305)
  - `finally` blocks (ch. 6, page 307)
  - catching various types of exceptions (ch. 6, page 309)
  - throwing a second exception (ch. 6, page 311)
  - recognizing common exception types (ch. 6, page 313)
    - runtime exceptions (ch. 6, page 314)
    - checked exceptions (ch. 6, page 317)
    - errors (ch. 6, page 317)
  - calling methods that throw exceptions (ch. 6, page 318)
  - exceptions in subclasses (ch. 6, page 319)
  - printing exceptions (ch. 6, page 321)
- review (appx. A, page 333)
  - java building blocks (appx. A, page 334)
  - operators and statements (appx. A, page 336)
  - core java APIs (appx. A, page 339)
  - methods and encapsulation (appx. A, page 342)
  - class design (appx. A, page 346)
  - exceptions (appx. A, page 349)
- study tips (appx. B, page 353 - 366)


<div class="break"></div>

### Resources

- http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
