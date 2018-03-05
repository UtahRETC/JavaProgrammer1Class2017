import java.time.*;
import java.time.format.*;

class DatesTimes4 {

  public static void main(String[] args) {
    // Print the current time and date
    LocalDate d = LocalDate.now();
    LocalTime t = LocalTime.now();
    LocalDateTime dt = LocalDateTime.now();

    // These lines are long so I am going to split them
    DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    System.out.println(mediumDate.format(d));
    System.out.println(shortTime.format(t));
    System.out.println(shortDateTime.format(dt));
    // This will not work
    System.out.println(shortDateTime.format(d));
  }
}
