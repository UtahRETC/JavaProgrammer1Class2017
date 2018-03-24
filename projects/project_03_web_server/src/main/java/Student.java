public class Student extends Person {
  private int grade;

  public Student(String firstName, String lastName, int grade) {
    super(firstName, lastName);
    this.grade = grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }
}
