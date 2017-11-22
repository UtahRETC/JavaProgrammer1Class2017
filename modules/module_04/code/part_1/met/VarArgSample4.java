package met;

public class VarArgSample4 {

  public void print(int... a) {
    System.out.println("Var-Arg Method");
  }

  public void print(int a) {
    System.out.println("Regular Method");
  }

  public static void main(String[] args) {
    VarArgSample4 x = new VarArgSample4();

    x.print(2);
    x.print(1, 2);
  }
}
