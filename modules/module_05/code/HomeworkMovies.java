public class HomeworkMovies {
  public static void main(String[] args) {
    String searchTitle = args[0];
    Movie[] movies = getMovies();

    // TODO: search through each movie to see if its title matches searchTitle

    // TODO: if a movie's title matches, print its info, using the getInfo() method

    // TODO: if no movies match the user input
  }

  public static Movie[] getMovies() {
    Movie starWars = new Movie();
    starWars.setTitle("Star Wars");
    starWars.setGenre("Science Fiction");

    // TODO: define a few of your favorite movies here!
    // You can use http://www.imdb.com/ for info.

    Movie[] movies = {starWars};
    return movies;
  }
}

class Movie {
  private String title;
  private String genre;
  private int year;

  // TODO: Define getter and setter methods for each of the above fields

  /**
   * Returns info about a Movie as a String.
   *
   * <p>For example:
   *
   * <p>Star Wars Genre: Science Fiction Released: 1977
   */
  public String getInfo() {
    // TODO: implement this method
    return "";
  }
}
