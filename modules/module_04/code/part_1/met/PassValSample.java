package met;

public class PassValSample {
  int no1;
  int no2;

  public void swap(int a, int b) {
    int c;
    System.out.println("In swap a: " + a + "  b:" + b);
    c = a;
    a = b;
    b = c;
    System.out.println("After swap a: " + a + "  b:" + b);
  }

  public static void main(String[] args) {
    PassValSample s = new PassValSample();
    s.no1 = 10;
    s.no2 = 20;
    System.out.println("Before call no1: " + s.no1 + "  no2:" + s.no2);
    s.swap(s.no1, s.no2);
    System.out.println("After call no1: " + s.no1 + "  no2:" + s.no2);
  }
}
