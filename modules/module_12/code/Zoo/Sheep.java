public class Sheep extends Animal {

  private String name;
  private String sound = "Baahahaa...";

  Sheep(String name) {
    super(name);
  }

  public static void main(String args[]) {
    Sheep shelly = new Sheep("Shelly");
    System.out.println("Name: " + shelly.getName());
    System.out.println("Sound: " + shelly.getSound());
  }
}
