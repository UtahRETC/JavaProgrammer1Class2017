import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static spark.Spark.*;

public class Main {
  public static void main(String[] args) {

    // Put your school logic here!!! -------------------------------------------
    School school = new School();
    // TODO: don't assign IDs out here, do it internally
    school.addPerson(new Student(1, "Andrew", "Jensen", 80));
    school.addPerson(new Student(2, "Eric", "Fortney", 96));
    school.addPerson(new Student(3, "Marcos", "Minond", 92));

    // End school logic. -------------------------------------------------------

    staticFiles.location("/build");

    port(3000);

    get("/api/students", (request, response) -> {
      response.type("application/json");
      return makeJson(school.getPeople());
    });

    get("/api/students/:id", (request, response) -> {
      response.type("application/json");
      int id = Integer.parseInt(request.params(":id"));
      return makeJson(school.getPersonById(id));
    });

    post("/api/students", (request, response) -> {
      response.type("application/json");
      Gson gson = new Gson();
      Student addedStudent = gson.fromJson(request.body(), Student.class);
      school.addPerson(addedStudent);
      return makeJson(addedStudent);
    });

    put("/api/students/:id/grade", (request, response) -> {
      response.type("application/json");
      int id = Integer.parseInt(request.params(":id"));
      Gson gson = new Gson();
      GradeRequest gradeRequest = gson.fromJson(request.body(), GradeRequest.class);
      school.setGrade(id, gradeRequest.grade);
      return "";
    });
  }

  public static String makeJson(Object o) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(o);
  }
}
