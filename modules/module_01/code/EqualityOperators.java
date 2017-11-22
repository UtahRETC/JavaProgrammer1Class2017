public class EqualityOperators {
  public static void main(String[] args) {
    String stringThree = "3";
    int intThree = 3;
    double doubleThree = 3;

    boolean isStringThreeEqualToIntThree = stringThree.equals(intThree);

    boolean isInt3EqualToDouble3 = intThree == doubleThree;

    System.out.println("Is String 3 equal to Int 3? " + isStringThreeEqualToIntThree);

    System.out.println("Is Int 3 equal to Double 3? " + isInt3EqualToDouble3);
  }
}
