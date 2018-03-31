# Module 15 Homework

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

## Getting started

## Homework assignment

#### Add students more students to the School

1. You can find the hardcoded students in the `generateSchool` method in the
   `Main.java` file.


#### Add the update grade endpoint
1. First step will be to add a private `grade` property to the `Student` class
   along with getters and setters and updates to the contructor.
2. In the request handler, lookup the student that needs to be updated.
3. Set the grade method on the student using the setter method.
4. Convert the student object that was just updated into JSON and return it.


#### Add the delete student endpoint

1. First step will be to add a `removeStudentById` method in the `School`
   class.
2. Add a new request handler in the `main` method.
3. Follow the example of the `post("/api/students", (request, response)`
   method.
4. Remove the student from the school using the `removeStudentById` method
   created in step 1.
5. Convert the student object that was just removed from the school into JSON
   and return it.
