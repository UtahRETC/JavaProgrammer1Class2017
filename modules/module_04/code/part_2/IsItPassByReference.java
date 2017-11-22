public class IsItPassByReference {

  public static void main(String[] args) {
    Person variable1 = new Person("Mary", 32);
    System.out.println(
        "variable1 name is " + variable1.getName() + " and Age is " + variable1.getAge());

    modify(variable1);

    System.out.println(
        "variable1 name is " + variable1.getName() + " and Age is " + variable1.getAge());

    Person variable2 = variable1;
    Person variable3 = new Person("Andre", 45);
    // variable1 now points to variable3
    variable1 = variable3;
    // WHAT IS OUTPUT BY THIS?
    System.out.println(
        "variable2 name is " + variable2.getName() + " and Age is " + variable2.getAge());
    System.out.println(
        "variable1 name is " + variable1.getName() + " and Age is " + variable1.getAge());
  }

  public static void modify(Person objPers) {
    objPers.setName("Jack");
    objPers.setAge(22);
  }
}

class Person {
  String name;
  int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
