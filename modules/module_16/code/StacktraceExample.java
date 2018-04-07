class MyException extends Exception {}

public class StacktraceExample {
  public static void main(String[] args) throws MyException {
    one();
  }

  public static void one() throws MyException {
    two();
  }

  public static void two() throws MyException {
    three();
  }

  public static void three() throws MyException {
    throw new MyException();
  }
}
