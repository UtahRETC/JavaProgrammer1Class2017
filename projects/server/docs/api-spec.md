# Web Server Project: API Specification

This document describes how the front end and back end will communicate for the web server project to work. The front end has already been built according to the spec, but you will need to finish building the server so it follows the same contract.



## Static Resources

### GET /

Serves up the HTML for the single-page app.



## Student Resource

### GET /api/students

Returns a list of all students in the system.

There will be no request body.

Example response body:

```json
[
  {
    "id": 1,
    "firstName": "Andrew",
    "lastName": "Jensen",
    "grade": 87
  },
  {
    "id": 2,
    "firstName": "Eric",
    "lastName": "Fortney",
    "grade": 90
  }
]
```

### GET /api/students/{id}

Returns information about a specific student.

There will be no request body.

Example response body:

```json
{
  "id": 2,
  "firstName": "Eric",
  "lastName": "Fortney",
  "grade": 90
}
```

### POST /api/students

Defines a new student in the class.

Example request body:

```json
{
  "firstName": "Martijn",
  "lastName": "van Exel"
}
```

*Notice how only the first and last name are posted. The server should assign an ID and an initial grade to the new student.*

Example response body:

```json
{
  "id": 5,
  "firstName": "Martijn",
  "lastName": "van Exel",
  "grade": 0
}
```

### PUT /api/students/{id}

Sets the first and last name for a student.

Example request body:

```json
{
  "firstName": "Ryan",
  "lastName": "Moore"
}
```

Example response body:

```json
{
  "id": 8,
  "firstName": "Ryan",
  "lastName": "Moore",
  "grade": 85
}
```

### PUT /api/students/{id}/grade

Sets the grade for a student.

Example request body:

```json
{
  "grade": 90
}
```

No response body will be sent.

### DELETE /api/students/{id}

Deletes a student from the system.

There will be no request body or response body.
