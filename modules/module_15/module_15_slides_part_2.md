<!--
$theme: default
page_number: true
footer: Java Class - Web Server Project (pt. 2)
-->

# Project 3: Web Server

## Part 2

- **Review of Concepts**
- **API Specs**
- **The Project**

--------------------------------------------------------------------------





# Review of Concepts

--------------------------------------------------------------------------

## Server and Client Architecture

- Many `clients` connect to a single `server` on the web

--------------------------------------------------------------------------

## Requests and Responses

- This is the way clients and servers communicate
- First, the client sends a `request`
- Next, the server reads the request and returns a `response`

--------------------------------------------------------------------------

## Protocols

- "A set of rules governing the exchange or transmission of data between devices"

--------------------------------------------------------------------------

## HTTP

- Rules for how to make `requests` and `responses` that others can understand
- Requests and responses always have `headers` and sometimes have a `body`

--------------------------------------------------------------------------

## HTTP Requests

- Message from the client to the server
- Important parts
  - Method
  - Path
  - Body (sometimes)

--------------------------------------------------------------------------

## HTTP Responses

- Message from the server back to the client
- Important parts
  - Status code
  - Body (usually)
  - content type (plain text, JSON, HTML, image data, etc.)

--------------------------------------------------------------------------

## JSON

- JavaScript Object Notation
- A grammar for sending data
- Not a programming language!
  - No logic or instructions, just data

--------------------------------------------------------------------------

## JSON Object Example

```json
{
  "id": 1,
  "firstName": "Andrew",
  "lastName": "Jensen",
  "education": {
    "school": "Brigham Young University",
    "graduationYear": 2015,
    "major": "Computer Science"
  },
  "interests": [
    "Java programming",
    "Going to rock concerts",
    "Watching movies"
  ]
}
```

--------------------------------------------------------------------------




# API Specs

--------------------------------------------------------------------------

## What is an API Spec?

- Documentation, for a web API

--------------------------------------------------------------------------

## Why are they useful?

- Code needs documentation, and so do web APIs
- If we write a thorough API spec, the client and server code can be written at the same time
  - Frontend developers can use `mock data` to simulate the server
  - Backend developers can use `mock data` to simulate a client
  - When both are finished, the client and server will send the same sort of data

--------------------------------------------------------------------------

## What's in an API Spec?

- `Resources`: Each resource represents a different entity, or a different class
  - Example: a grading system would have a `student` resource because we need to get/set data involving students
  - Example: a restaurant system would have a `reservations` resource to keep track of reserved tables
- `Endpoints`: Each endpoint is a combination of a path and HTTP method
  - Example: a public library might have an endpoint like `POST /api/events/checkout` to create a new record of checking out some books

--------------------------------------------------------------------------

## An example endpoint

**GET /api/students/{id}**

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

--------------------------------------------------------------------------

## An example endpoint (continued)

Things to notice:

- HTTP method (`GET`)
- Path (`/api/students/{id}`)
- Request parameter: `{id}` should be replaced by an ID number for a student
  - Example: `GET /api/students/5`
- Details about the `request body` and `response body`

--------------------------------------------------------------------------

## A note about example requests/responses

- Not actual data on the server, just examples
- Pay attention to the JSON format
  - What are the data types?
  - What are the parameter names?

--------------------------------------------------------------------------

## Practice (1)

Suppose we are building a system to keep track of flights. What resources should the API have?

--------------------------------------------------------------------------

## Practice (2)

Suppose we are writing an API spec for a social media platform. What would each of these endpoints do?

- `POST /posts`
- `GET /posts/{postId}`
- `PUT /posts/{postId}`
- `GET /posts/{postId}/comments`
- `POST /posts/{postId}/comments`
- `PUT /posts/{postId}/comments/{commentId}`
