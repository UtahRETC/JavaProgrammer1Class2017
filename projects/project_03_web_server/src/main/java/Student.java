public class Student extends Person {
  int grade;

  public Student(int id, String firstName, String lastName, int grade) {
    super(id, firstName, lastName);
    this.grade = grade;
  }
}
