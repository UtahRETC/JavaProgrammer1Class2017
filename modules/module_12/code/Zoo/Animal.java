public class Animal {
  private String name;
  private String sound = "I'm a generic animal!!";

  Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getSound() {
    return sound;
  }

  public static void main(String args[]) {
    Animal generic = new Animal("No Name");
    System.out.println("Name: " + generic.getName());
    System.out.println("Sound: " + generic.getSound());
  }
}
