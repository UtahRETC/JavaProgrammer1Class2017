public class Duck {
  // Sound the duck makes
  private String sound = "";

  public void says(String s) {
    sound = s;
  }

  public String speak() {
    return sound;
  }

  public boolean equals(Duck other) {
    if (other == null) {
      return false;
    }
    if (this == other) {
      return true;
    }
    if (this.speak().equals(other.speak())) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Duck a = new Duck();
    a.says("quack");
    Duck b = new Duck();
    b.says("quack");
    if (a == b) System.out.println("refs are equal!");
    if (a.equals(b)) System.out.println("ducks are equal!");
  }
}
