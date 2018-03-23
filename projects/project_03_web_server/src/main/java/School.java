import java.util.ArrayList;
import java.util.List;

public class School {
  int nextId;
  List<Person> people;

  public School() {
    this.nextId = 1;
    this.people = new ArrayList<Person>();
  }

  public List<Person> getPeople() {
    return this.people;
  }

  public void addPerson(Person p) {
    this.people.add(p);
    // TODO: assign an ID
  }

  public Person getPersonById(int id) {
    for (Person p : people) {
      if (p.id == id) {
        return p;
      }
    }

    return null;
  }

  public void setGrade(int id, int score) {
    for (Person p : people) {
      if (p.id == id && p instanceof Student) {
        Student s = (Student) p;
        s.score = score;
        return;
      }
    }
  }
}
