public class Person {

  private static int nextId = 1;

  static int getNextId() {
    return nextId++;
  }

  private int id;
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.id = getNextId();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getId() { return this.id; }

  public void assignId() {
    this.id = getNextId();
  }
}
