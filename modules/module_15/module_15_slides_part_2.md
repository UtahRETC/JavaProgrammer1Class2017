<!--
$theme: default
page_number: true
footer: Java Class - Module 15, part 2
-->

# Module 15, part 2

- **Review of Previous Week**
- **Servers and long running processes.**
- **What is a request?**
- **Lambdas 101**
- **Code, Lambdas 101**
- **What is a request handler?**
- **JSON, how and why.**
- **What is Spark?**
- **What is Gradle?**

-----------------------------------------------------------------------------

# Review of Previous Week

-----------------------------------------------------------------------------

# This week we're building a Web Server

-----------------------------------------------------------------------------

# Servers and long running processes.

So far we've been working with processes that start and stop once they complete their task. But what about processes that have no known completion? For example, like an HTTP Server. The server doesn't know when a user is going to visit a webpage, so instead it just starts and waits for a request. And as long as nothing goes wrong, it will keep running and listen for more requests.

Many clients connect to a single server on the web

-----------------------------------------------------------------------------

# Request and response

This is the way clients and servers communicate. First, the client sends a `request`. Next, the server reads the request and returns a `response`.

-----------------------------------------------------------------------------

# HTTP request and response

A request is made up of the following parts:

- URL/Path
- Method
- Body (sometimes)

A response is made up of the following parts:

- Status code
- Content type (html, json, xml, etc.)
- Body

-----------------------------------------------------------------------------

# Lambdas 101

-----------------------------------------------------------------------------

# What is a request handler?

A request handler is the code that is designated to run when a specific request is made to your server.

```java
get("/api/students", (request, response) -> {
  response.type("application/json");
  List<Student> students = school.getStudents();
  return toJson(students);
});
```

-----------------------------------------------------------------------------

```java
post("/api/students", (request, response) -> {
  response.type("application/json");

  UpdateStudentRequest updates = fromJson(
      request.body(),
      UpdateStudentRequest.class
  );

  Student studentToAdd = new Student(
    updates.firstName,
    updates.lastName
  );

  school.addStudent(studentToAdd);

  return toJson(studentToAdd);
});
```

-----------------------------------------------------------------------------

# What is Spark?

In the previous slides we were calling methods like `post` and `get`, but where do they come from? This is where Spark comes in. Spark simplifies on the common tasks that all servers need to do so that you can focus on what is unique about your application.

-----------------------------------------------------------------------------

# JSON, why.

JSON stands for "JavaScript Object Notation" and it is a format for encoding data.

```java
class Student {
  public String firstName;
  public String lastName;
  public int grade;
}

Student me = new Student("Marcos", "Minond", 99);
```

```
{
  "firstName": "Marcos",
  "lastName": "Minond",
  "grade": 99,
}
```

-----------------------------------------------------------------------------

# JSON, how

Along with Spark, we have provided the `toJson` and `fromJson` methods to help you convert to and from JSON. Under the hood, these methods are using a library called `Gson`.

-----------------------------------------------------------------------------

# What is Gradle?

Gradle is what is known as a _build tool_. A build tool is a program that helps with certain tasks, like running code, running test, and downloading dependecies (third-party code).

Gradle is what we use to glue together Spark, Gson, and our own code.

-----------------------------------------------------------------------------

# Additional resources

1. Spark documentation, http://sparkjava.com/documentation

-----------------------------------------------------------------------------

# Reference list

1. Spark framework, http://sparkjava.com/
2. Google Gson library, https://github.com/google/gson
3. Gradle build tool, https://gradle.org/
