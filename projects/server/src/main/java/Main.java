import static spark.Spark.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Main {
  private static School generateSchool() {
    School school = new School();

    // TODO Add more students to this list.
    school.addStudent(new Student("Andrew", "Jensen"));
    school.addStudent(new Student("Eric", "Fortney"));
    school.addStudent(new Student("Moore", "Ryan"));
    school.addStudent(new Student("Marcos", "Minond"));

    return school;
  }

  private static void createHandlers() {
    School school = generateSchool();

    get("/api/students", (request, response) -> {
      response.type("application/json");

      List<Student> students = school.getStudents();
      String json = toJson(students);

      return json;
    });

    get("/api/students/:id", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      Student student = school.getStudentById(id);
      String json = toJson(student);

      return json;
    });

    post("/api/students", (request, response) -> {
      response.type("application/json");

      UpdateStudentRequest updates = fromJson(request.body(), UpdateStudentRequest.class);
      Student studentToAdd = new Student(updates.firstName, updates.lastName);
      school.addStudent(studentToAdd);
      String json = toJson(studentToAdd);

      return json;
    });

    put("/api/students/:id", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      Student studentToUpdate = school.getStudentById(id);

      UpdateStudentRequest updates = fromJson(request.body(), UpdateStudentRequest.class);
      studentToUpdate.setFirstName(updates.firstName);
      studentToUpdate.setLastName(updates.lastName);
      String json = toJson(studentToUpdate);

      return json;
    });

    put("/api/students/:id/grade", (request, response) -> {
      response.type("application/json");

      int id = Integer.parseInt(request.params(":id"));
      UpdateGradeRequest update = fromJson(request.body(), UpdateGradeRequest.class);
      // TODO Finish implementing this endpoint.

      return "";
    });

    // TODO Implement the DELETE /api/students/{id} endpoint here.
  }

  public static void main(String[] args) {
    staticFiles.location("/dist");
    port(3000);

    createHandlers();

    exception(Exception.class, (e, request, response) -> {
      response.type("application/json");
      response.status(500);

      ErrorResponse result = new ErrorResponse(e);
      String json = toJson(result);
      response.body(json);
    });

    awaitInitialization();
    System.out.println("");
    System.out.println("Server is running!");
    System.out.println("Navigate to http://localhost:3000 to use it.");
    System.out.println("");
  }

  private static String toJson(Object o) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(o);
  }

  private static <T> T fromJson(String json, Class<T> klass) {
    Gson gson = new Gson();
    return gson.fromJson(json, klass);
  }
}
