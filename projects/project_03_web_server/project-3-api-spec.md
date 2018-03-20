# Project 3: Web Server

## Endpoints

**GET /**

Serves up the HTML for the single-page app.

**GET /people**

Serves up a list of all people in the system.

Response body:

```json
{
  "people": [
    {
      "id": 1,
      "type": "TEACHER",
      "firstName": "Andrew",
      "lastName": "Jensen"
    },
    {
      "id": 2,
      "type": "STUDENT",
      "firstName": "Abdullah",
      "lastName": "Kareem"
    }
  ]
}
```

**GET /students/{studentID}**

Gets information about a specific student. This will be used by the student view and the teacher view.

Response body:

```json
{
  "id": 2,
  "firstName": "Abdullah",
  "lastName": "Kareem",
  "grade": 90
}
```

**POST /students**

Defines a new student in the class.

Request body:

```json
{
  "firstName": "Abdullah",
  "lastName": "Kareem"
}
```

Response body:

```json
{
  "id": 5
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
