package var;

public class LocalVarSample {

  public void print() {
    int i = 10;
    System.out.println(i); // Error(8,26): variable i might not have been initialized
  }

  public static void main(String[] args) {
    LocalVarSample localVarSample = new LocalVarSample();
    localVarSample.print();
  }
}
