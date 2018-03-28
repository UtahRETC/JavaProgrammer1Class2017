# Web Server Project: API Specification

TODO: add overview here



## Static Resources

**GET /**

Serves up the HTML for the single-page app.



## Student Resource

**GET /api/students**

Returns a list of all students in the system.

Example response body:

```json
[
  {
    "id": 1,
    "firstName": "Andrew",
    "lastName": "Jensen"
  },
  {
    "id": 2,
    "firstName": "Eric",
    "lastName": "Fortney"
  }
]
```

**GET /api/students/{id}**

Returns information about a specific student.

Example response body:

```json
{
  "id": 2,
  "firstName": "Abdullah",
  "lastName": "Kareem",
  "grade": 90
}
```

**POST /api/students**

Defines a new student in the class.

Example request body:

```json
{
  "firstName": "Abdullah",
  "lastName": "Kareem"
}
```

Notice how only the first and last name are posted. The server will assign an ID and an initial score to the new student.

Example response body:

```json
{
  "id": 5
}
```

**PUT /api/students/{id}/grade**

Sets the grade for a student.

Example request body:

```json
{
  "grade": 90
}
```

No response body will be sent.
