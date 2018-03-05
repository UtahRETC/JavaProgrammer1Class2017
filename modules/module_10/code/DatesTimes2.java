import java.time.*;

class DatesTimes2 {

  public static void main(String[] args) {
    // Now let's print some specific days / times
    LocalDate yesterday = LocalDate.of(2017, 1, 26);
    LocalTime noon = LocalTime.of(12, 0);
    LocalDateTime l = LocalDateTime.of(2017, 1, 26, 12, 0);

    // Or we can combine a date and time into a datetime
    LocalDateTime l2 = LocalDateTime.of(yesterday, noon);

    System.out.println("yesterday: " + yesterday);
    System.out.println("noon: " + noon);
    System.out.println("Together: " + l);
    System.out.println("Same result: " + l2);
  }
}
