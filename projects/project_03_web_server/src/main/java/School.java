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
  }

}
