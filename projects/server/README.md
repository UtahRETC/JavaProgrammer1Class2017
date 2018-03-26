# Web Server Project

## Endpoints

**GET /**

Serves up the HTML for the single-page app.

**GET /students**

Serves up a list of all students in the system.

Response body:

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

**GET /students/{studentID}**

Gets information about a specific student. This will be used by the student view and the teacher view.

Response body:

```json
{
  "id": 2,
  "firstName": "Eric",
  "lastName": "Fortney",
  "grade": 90
}
```

**POST /students**

Defines a new student in the class. Their grade should default to 0.

Request body:

```json
{
  "firstName": "Marcos",
  "lastName": "Minond"
}
```

Response body:

```json
{
  "id": 5,
  "firstName": "Marcos",
  "lastName": "Minond",
  "grade": 0
}
```

**PUT /students/{studentID}/grade**

Sets the grade for a student.

Request body:

```json
{
  "grade": 90
}
```

No response body will be sent.
