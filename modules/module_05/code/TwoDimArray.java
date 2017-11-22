// Objective: Print out: "abcdefghijklmnopqrstuvwxyz"
// Concepts: multidimensional arrays, .length attribute
public class TwoDimArray {
  public static void main(String[] args) {

    String[][] alpha = {
      {"abc", "de", "fg"}, {"h"}, {"ijk", "l"}, {"mno", "p", "qr", "stuv"}, {"wx", "yz"}
    };

    int outerBound = 0; // What should this be?
    for (int i = 0; i < outerBound; i++) {
      int innerBound = 0; // What should this be?
      for (int j = 0; j < innerBound; j++) {
        System.out.print(""); // How can we print it out?
      }
    }
    System.out.print("\n");
  }
}
