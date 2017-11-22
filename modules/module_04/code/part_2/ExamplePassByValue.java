public class ExamplePassByValue {

  public static void main(String[] args) {
    int passing = 3;
    receiving(passing);
    System.out.println("The value of passing is: " + passing);
  }

  public static void receiving(int var) {
    var = var + 2;
  }
}
