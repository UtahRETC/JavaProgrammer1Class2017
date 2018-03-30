import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static spark.Spark.*;

public class Main {
  public static void main(String[] args) {

    // Put your school logic here!!! -------------------------------------------

    School school = new School();

    // TODO: try adding some initial students here, like this...
    school.addStudent(new Student("Andrew", "Jensen"));
    school.addStudent(new Student("Eric", "Fortney"));

    // End school logic. -------------------------------------------------------

    staticFiles.location("/dist");

    port(3000);

    get("/api/students", (request, response) -> {
      response.type("application/json");

      List<Student> students = school.getStudents();
      String json = makeJson(students);

      return json;
    });

    get("/api/students/:id", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      Student student = school.getStudentById(id);
      String json = makeJson(student);

      return json;
    });

    post("/api/students", (request, response) -> {
      response.type("application/json");

      Gson gson = new Gson();
      UpdateStudentRequest updates = gson.fromJson(request.body(), UpdateStudentRequest.class);
      Student studentToAdd = new Student(updates.firstName, updates.lastName);
      school.addStudent(studentToAdd);
      String json = makeJson(studentToAdd);

      return json;
    });

    put("/api/students/:id", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      Student studentToUpdate = school.getStudentById(id);

      Gson gson = new Gson();
      UpdateStudentRequest updates = gson.fromJson(request.body(), UpdateStudentRequest.class);
      studentToUpdate.setFirstName(updates.firstName);
      studentToUpdate.setLastName(updates.lastName);
      String json = makeJson(studentToUpdate);

      return json;
    });

    put("/api/students/:id/grade", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      Gson gson = new Gson();
      UpdateGradeRequest update = gson.fromJson(request.body(), UpdateGradeRequest.class);

      // TODO: finish implementing this endpoint...

      return "";
    });

    // TODO: implement the DELETE /api/students/{id} endpoint here...

    exception(Exception.class, (e, request, response) -> {
      response.type("application/json");

      ErrorResponse result = new ErrorResponse(e);
      String json = makeJson(result);
      response.body(json);
    });

    awaitInitialization();
    System.out.println("");
    System.out.println("Server is running!");
    System.out.println("Navigate to http://localhost:3000 to use it.");
    System.out.println("");
  }

  public static String makeJson(Object o) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(o);
  }
}
