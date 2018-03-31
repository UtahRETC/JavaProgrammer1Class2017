public class Student {
  private static int nextId = 1;
  private int id;
  private String firstName;
  private String lastName;
  private int grade;

  public Student(String firstName, String lastName) {
    this.id = getNextId();
    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = 0;
  }

  static int getNextId() {
    return nextId++;
  }

  public int getId() {
    return this.id;
  }

  public void assignId() {
    this.id = getNextId();
  }

  public void setFirstName(String newFirstName) {
    this.firstName = newFirstName;
  }

  public void setLastName(String newLastName) {
    this.lastName = newLastName;
  }
}
