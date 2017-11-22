public class MovieRunner {
  public static void main(String[] args) {
    // Movie #1
    Person ford = new Person("Harrison Ford");
    Person lucas = new Person("George Lucas");
    ProductionCompany company = new ProductionCompany("company #1");
    Movie jedi = new Movie("Return of the Jedi", ford, lucas, company);

    // Movie #2
    Person actor2 = new Person("Faceless Actor");
    Person writer2 = new Person("Shadowy Figure");
    ProductionCompany company2 = new ProductionCompany("company #2");
    Movie movie2 = new Movie("Movie2", actor2, writer2, company2);

    // Movie #3
    Person actor3 = new Person("actor #3");
    Person writer3 = new Person("writer #3");
    ProductionCompany company3 = new ProductionCompany("company #3");
    Movie movie3 = new Movie("Movie 3", actor3, writer3, company3);

    jedi.info();
    movie2.info();
    movie3.info();
  }
}
