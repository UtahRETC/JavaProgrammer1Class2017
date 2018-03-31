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

-----------------------------------------------------------------------------

# JSON, how and why.

JSON stands for "JavaScript Object Notation" and it is a format for encoding data.

```
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

# What is Spark?

-----------------------------------------------------------------------------

# What is Gradle?

-----------------------------------------------------------------------------

# Additional resources

1. None.

-----------------------------------------------------------------------------

# Reference list

1. None.
