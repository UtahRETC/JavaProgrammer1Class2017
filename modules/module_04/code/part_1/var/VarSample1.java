package var;

public class VarSample1 {
  public static void main(String[] args) {
    Variables v = new Variables();
    System.out.println(v.sDef);
    System.out.println(v.sPub);
    // System.out.println(v.sPri);// Error : sPri has private access in var.Variables1
    System.out.println(v.sPro);
  }
}
