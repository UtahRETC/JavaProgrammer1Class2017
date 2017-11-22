public class PassByValueExample {

  public static void main(String args[]) {
    Animal a1 = new Animal("Lion");
    Animal a2 = new Animal("Crocodile");

    System.out.println("Before Swap:- a1:" + a1.getName() + "; a2:" + a2.getName());
    swap(a1, a2);
    System.out.println("After Swap:- a1:" + a1.getName() + "; a2:" + a2.getName());
  }

  public static void swap(Animal animal1, Animal animal2) {
    Animal temp = new Animal("");
    temp = animal1;
    animal2 = animal1;
    animal2 = temp;
  }
}

class Animal {
  String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
