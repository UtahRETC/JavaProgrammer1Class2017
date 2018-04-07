class InvalidUserGradeException extends Exception {
  private String givenGrade;

  public InvalidUserGradeException(String givenGrade) {
    super("Invalid User Grade");
    this.givenGrade = givenGrade;
  }

  public InvalidUserGradeException(String msg, String givenGrade) {
    super(msg);
    this.givenGrade = givenGrade;
  }

  public String getGivenGrade() {
    return givenGrade;
  }
}
