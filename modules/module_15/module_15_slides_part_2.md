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

(TODO: turn this outline into slides)

- What are they?
  - Documentation for APIs
  - Why are they useful?

- How do we read them?
  - Each resource: a different entity or class
  - Each endpoint: a method and path
  - Path parameters
  - Example requests and responses

- Practice
  - What resources would be contained in software for a public library?
  - What resources would be contained in software for a _____?
  - What tasks do these endpoints perform for a social media site?

- Let's look at the spec for this project!

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

## How do we read an API Spec?

TODO expand this

--------------------------------------------------------------------------

# The Project

--------------------------------------------------------------------------

--------------------------------------------------------------------------

--------------------------------------------------------------------------
