public class Student extends Person {
  int score;

  public Student(int id, String firstName, String lastName, int score) {
    super(id, firstName, lastName);
    this.score = score;
  }
}
