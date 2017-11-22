package met;

public class PassRefSample {
  int no1;
  int no2;

  public void swap(PassRefSample s1) {
    int no;
    System.out.println(" In swap no1: " + s1.no1 + "  no2:" + s1.no2);
    no = s1.no1;
    s1.no1 = s1.no2;
    s1.no2 = no;
    System.out.println("After swap no1: " + s1.no1 + "  no2:" + s1.no2);
  }

  public static void main(String[] args) {
    PassRefSample s = new PassRefSample();
    s.no1 = 10;
    s.no2 = 20;
    System.out.println("Before call no1: " + s.no1 + "  no2:" + s.no2);
    s.swap(s);
    System.out.println("After call no1: " + s.no1 + "  no2:" + s.no2);
  }
}
