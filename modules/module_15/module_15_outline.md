# Java cert prep class (Module 15)

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

### TODO

- ~~What do need to finish the Server project?~~
  - ~~Error handling needs to display errors that will help debug the backend. _Ryan & Marcos_~~
    - ~~Front end displays errors that are specific to the front end. Like the response format is wrong.~~
    - ~~Backend logs any time it sends out an error response.~~
    - ~~Anything that would be useful when debugging the creating of new endpoints.~~
  - ~~Add logging to the backend code. _Andrew_~~

- Slides
  - Should cover how to read and implement the spec. _Andrew_


### Slide content outline

- Long running processes.
- Lambdas.
- What is a request in general? Body, params, url, method.
- What is a request handler?
- JSON, converting to and converting from. How and why.
- What is Spark? What is Gradle?


### During class

1. Checkout the code, build, and run the application.
2. Implement `GET /api/students`.
3. Add the `lastName` property to the `Student` class along with all of the
   updates required to save that field from the client.


### Homework

- **Add students**
  1. You can find the hardcoded students in the `generateSchool` method in the
     `Main.java` file.
- **Add the update grade endpoint**
  1. First step will be to add a private `grade` property to the `Student`
     class along with getters and setters and updates to the contructor.
  2. In the request handler, lookup the student that needs to be updated.
  3. Set the grade method on the student using the setter method.
  4. Convert the student object that was just updated into JSON and return it.
- **Add the delete student endpoint**
  1. First step will be to add a `removeStudentById` method in the `School`
     class.
  2. Add a new request handler in the `main` method.
  3. Follow the example of the `post("/api/students", (request, response)`
     method.
  4. Remove the student from the school using the `removeStudentById` method
     created in step 1.
  5. Convert the student object that was just removed from the school into JSON
     and return it.
