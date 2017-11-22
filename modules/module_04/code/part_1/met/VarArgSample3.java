package met;

public class VarArgSample3 {
  public static void main(String[] args) {
    VarArgSample3 x = new VarArgSample3();
    x.print(1, 2, 3, 'a', 'b', 'c', 'd');
  }

  //  public void print(int... a, char... c) //Error : ')' expected
  public void print(int... a) {
    for (int i : a) System.out.println(i);
    /*   for (char ch : c) System.out.println(ch); */
  }
}
