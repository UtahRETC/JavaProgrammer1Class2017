# Module 16 Homework

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

#### Reading

Pages 299 - 323 of the OCA book.


#### Exception handling in _Student Management System_ project

Right now, a `NumberFormatException` is thrown when an invalid integer is
provided in the grade field in the Update Grade modal of the Student Management
System. Update the appropriate endpoint so that instead of returning an error,
it sets the user's grade to 0 when it fails to parse the input. Here's the
current error:

<center>
  <img src="assets/homework-error-input.png" height="300" />
  <img src="assets/homework-error-response.png" height="300" />
</center>
