package met;

public class VarArgSample2 {

  // public void show( int... a, String name) {  //Error : ')' expected
  public void show(String name, int... a) {
    System.out.println(name + " scores :");
    for (int i : a) System.out.println(i);
  }

  public static void main(String[] args) {
    VarArgSample2 x = new VarArgSample2();
    x.show("Sam", 90, 80);
    x.show("Tom", 56, 90, 80, 50);
  }
}
