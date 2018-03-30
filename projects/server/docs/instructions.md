# Web Server Project: Instructions

## Step 1: Install dependencies

You will need Gradle on your computer to run the server project. Gradle is a build tool, which means it will help you download libraries and compile your Java code.

## Step 2: Run the starter code

Check out the repo and go to the project directory in your terminal.

Next, run this command to download libraries and compile your code:

```text
gradle build
```

This might take a while the first time.

Next, run this command to start up the server:

```text
gradle run
```

You will notice a progress bar pause at 75%: "Run". That means the server is now running! The server is different from other homework we've done in the past, because it is a *long-running process*, meaning it needs to keep running in order to do its work rather than running quickly and finishing.

Remember that you can stop the server by pressing **CTRL+C**.

Now, open your web browser and navigate to http://localhost:3000. You should see something like this:

TODO: show screenshot here

This means all of the starter code is working and you can start on your part of the project!

## Step 3: Finish implementing the server

Remember that the project has two parts: the *server* and the *client*. The client code is already finished, but you need to finish up the server code. You will be able to perform some actions without changing anything, but you will need to implement two final API endpoints to make the whole system work. These are the endpoints in the system:

- `GET /api/students` (finished)
- `GET /api/students/{id}` (finished)
- `POST /api/students` (finished)
- `PUT /api/students/{id}` (finished)
- `PUT /api/students/{id}/grade` (TODO!)
- `DELETE /api/students/{id}` (TODO!)

The **API Specification Document** has the full details on what these endpoints should look like. Your endpoints need to return JSON data like the example responses in the document.

In order to implement the last two endpoints, you will need to add code to the `Main` class, but you will also need to modify the `School` class. Implement a `setGrade` method and a `deleteStudent` method.

The `setGrade` method should take two parameters: a student's ID and a new grade. It should look through the students until it finds the right one, then change the grade to the new value.

The `deleteStudent` method take one parameter: the ID of the student to delete. It should find the student that has that ID and remove it out of the list of students.

Make sure your endpoints return the right kind of data in their HTTP responses too! The API Spec will tell you what they need to look like.
