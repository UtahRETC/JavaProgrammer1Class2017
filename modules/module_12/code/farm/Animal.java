public abstract class Animal {
  public Animal(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  public final String getName() {
    return this.name;
  }

  public final String getSound() {
    return this.sound;
  }

  public final void singVerse() {
    System.out.println("Old MacDonald had a farm, E I E I O!");
    System.out.println("And on that farm he had a " + getName() + ", E I E I O!");

    // TODO: finish this!!! Look at the homework instructions to know what to put here.
  }
}
