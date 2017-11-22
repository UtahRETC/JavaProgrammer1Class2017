public class Movie {
  public Person writer;
  public Person actor;
  public ProductionCompany prodCompany;
  public String movieTitle;

  public Movie(String t, Person a, Person w, ProductionCompany pc) {
    movieTitle = t;
    actor = a;
    writer = w;
    prodCompany = pc;
  }

  public void info() {
    System.out.println(movieTitle);
    System.out.println("Writer: " + writer.name);
    prodCompany.info();
    System.out.println("Star: " + actor.name);
  }
}
