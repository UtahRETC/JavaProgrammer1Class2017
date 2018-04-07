public class Sample {
  public static void main(String[] args)
      throws IllegalArgumentException, InvalidUserGradeException {
    if (args.length == 0) {
      throw new IllegalArgumentException("Expecting a grade argument");
    } else {
      int grade = Integer.parseInt(args[0]);

      if (grade < 0 || grade > 100) {
        throw new InvalidUserGradeException(Integer.toString(grade));
      } else {
        System.out.println("The user's grade is now " + grade);
      }
    }
  }
}
