package var;

public class EncapSample1 {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    EncapSample1 s = new EncapSample1();
    s.setName("java");
    System.out.println(s.getName());
  }
}
