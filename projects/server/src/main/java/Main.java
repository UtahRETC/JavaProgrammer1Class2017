import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static spark.Spark.*;

public class Main {
  public static void main(String[] args) {

    // Put your school logic here!!! -------------------------------------------

    School school = new School();

    // TODO: try adding some initial students here, like this...
    // Remember that we need to switch "Person" for "Student" later
    school.addPerson(new Person("Andrew", "Jensen"));
    school.addPerson(new Person("Eric", "Fortney"));

    // End school logic. -------------------------------------------------------

    staticFiles.location("/build");

    port(3000);

    get("/api/students", (request, response) -> {
      response.type("application/json");
      return makeJson(school.getPeople());
    });

    get("/api/students/:id", (request, response) -> {
      // TODO: implement this endpoint!

      return makeJson(null); // TODO: swap this out
    });

    // TODO: implement the POST /api/students endpoint

    put("/api/students/:id/grade", (request, response) -> {
      response.type("application/json");
      int id = Integer.parseInt(request.params(":id"));
      Gson gson = new Gson();
      GradeRequest gradeRequest = gson.fromJson(request.body(), GradeRequest.class);
      // TODO: implement the setGrade method for the School class,
      // then uncomment the following line
      // school.setGrade(id, gradeRequest.grade);
      return "";
    });
  }

  public static String makeJson(Object o) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(o);
  }
}
