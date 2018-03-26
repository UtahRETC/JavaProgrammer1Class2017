public class Cow extends Animal {

  private String name;
  private String sound = "Moo...";

  Cow(String name) {
    super(name);
  }

  public String getSound() {
    return sound;
  }

  public static void main(String args[]) {
    Cow beefy = new Cow("beefy");
    System.out.println("Name: " + beefy.getName());
    System.out.println("Sound: " + beefy.getSound());
  }
}
