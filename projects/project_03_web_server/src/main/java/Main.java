import java.util.List;
import java.util.ArrayList;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
  public static void main(String[] args) {
    port(3000);

    get("/", (request, response) -> "Hello World! This endpoint should actually serve up the index.html file.");

    get("/api/people", (request, response) -> {
      return "This is return JSON for all the people in the system.";
    });

    get("/api/students/:id", (request, response) -> {
      String id = request.params(":id");
      return "This should return info for student number " + id + ".";
    });

    post("/api/students", (request, response) -> {
      return "You just POSTed info to define a new student.";
    });

    put("/api/students/:id/grade", (request, response) -> {
      String id = request.params(":id");
      return "You just set a student's grade to something new.";
    });

    // path("/api", () -> {
    //
    //   get("/animals", (req, res) -> {
    //     res.type("application/json");
    //
    //     List<Animal> animals = new ArrayList<Animal>();
    //
    //     animals.add(new Animal(3, "Anders", 3));
    //     animals.add(new Animal(1, "Spot", 15));
    //     animals.add(new Animal(2, "Zippy", 6));
    //
    //     Gson gson = new GsonBuilder().setPrettyPrinting().create();
    //     return gson.toJson(animals);
    //   });
    //
    // }); // end API

  }

}
