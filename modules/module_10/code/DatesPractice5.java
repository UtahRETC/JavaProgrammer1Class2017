import java.time.*;
import java.time.format.*;

class DatesPractice5 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		// This will print: 1/24/18 2:42 PM
		System.out.println(shortF.format(now));

		// This will print: Jan 24, 2018 2:42:58 PM
		System.out.println(mediumF.format(now));
	}
}