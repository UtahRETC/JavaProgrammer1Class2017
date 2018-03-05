import java.util.*;

public class Person {
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public final String getName() {
    System.out.println(name);
    return this.name;
  }

  public int getAge() {
    System.out.println(age);
    return this.age;
  }

  public void setAge(int newValue) {
    System.out.println("New age set! New: " + newValue);
    this.age = newValue;
  }

  public void birthday() {
    System.out.println("Happy birthday!");
    this.age += 1;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}
